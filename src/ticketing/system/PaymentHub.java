package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import static ticketing.system.TransactionType.*;

/**
 * Present for vehicles and gateways to allow or prevent user travel.
 * Is the software which is delegated to by gates through which users travel.
 * Handles logic to determine whether users can travel through gates.
 * Does not make changes to users account balance but does call methods which
 * charge the users account for travel if applicable.
 */


class PaymentHub {

    private Area area;     //this is the area location
    private TravelPoint parentTravel = null;
    private Vehicle parentVehicle = null;
    private int numGateways;
    private List<Gateway> gateways;

    public PaymentHub(Object parent, int numGateways) {
        if (parent.getClass() == TravelPoint.class) {
            this.parentTravel = (TravelPoint) parent;
        }
        if (parent.getClass() == Vehicle.class) {
            this.parentVehicle = (Vehicle) parent;
        }
        gateways = new ArrayList();
        this.numGateways = numGateways;
        for (int i = 0; i < numGateways; i++) {
            gateways.add(new EntryGate(new DigitalReader(), this));
        }
    }

    public boolean canUserTravel(int tokenId) {
        Ticket ticket;
        boolean hasPass = false;
        UserAccount user = UserAccountManager.getInstance().getUserAccountByTokenId(tokenId);
        if (user == null) {
            return false;
        } else {
            if (canUserAffordPayment(user)) {
                ticket = new Ticket(new Date());
                if (parentTravel != null) {
                    ticket.setValidFrom(parentTravel);
                }
                if (parentVehicle != null) {
                    ticket.setRoute(parentVehicle.getCurrentRoute());
                    ticket.setValidFrom(parentVehicle.getTravelPoint());
                    hasPass = user.checkActivePasses(parentVehicle.getCurrentRoute());
                }
                if (!hasPass) {
                    purchaseTicket(user, ticket);
                }
                user.setActiveTicket(ticket);
                return true;
            } else {
                return false;
            }
        }
    }

    public void applyTicketToAcount(Ticket ticket, int token) {
        UserAccount user = UserAccountManager.getInstance().getUserAccountByTokenId(token);
        user.setActiveTicket(ticket);
    }

    private boolean canUserAffordPayment(UserAccount user) {
        System.out.println(user);
        System.out.println(getParentTravelPoint());
        return user.canAccountBeDebited(getParentTravelPoint().getPrice());
    }

    private void purchaseTicket(UserAccount user, Ticket ticket) {
        Transaction transaction = new Transaction(Cash, getParentTravelPoint().getPrice(), new Date());
        user.makePayment(getParentTravelPoint().getPrice());
        user.addTransaction(transaction);
    }

    private TravelPoint getParentTravelPoint() {
        return parentTravel != null ? parentTravel
                : parentVehicle.getTravelPoint();
    }

    public boolean canUserLeave(int tokenId) {
        //Acquires a user and retrieves current ticket
        UserAccount acct = (UserAccountManager.getInstance().getUserAccountByTokenId(tokenId));
        Ticket ticket = acct.getActiveTicket();
        if (ticket == null) {
            return false;
        }
        ticket.setEndPoint(getParentTravelPoint());
        startAutomatedPayment(acct);
        return true;
    }
    
    public void setArea(Area a)
    {
        area = a;
    }

    void startAutomatedPayment(UserAccount acct) {
        List<Route> relevantRoutes = area.getRoutes();     //temp routes
        for (Iterator<Route> it = relevantRoutes.iterator(); it.hasNext();) {
            
            if (acct.checkActivePasses( it.next() ) )   //implement
            {
                acct.clearActiveTicket();               //implement
                break;
            }
              
            
        }

    }

    public Gateway getGatewayId(int i) {
        return gateways.get(i);
    }
}
