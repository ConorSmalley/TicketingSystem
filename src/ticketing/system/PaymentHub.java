package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import static ticketing.system.TransactionType.*;

/**
 * Present for vehicles and gateways to determine whether to allow or prevent user travel.
 * Is the software which is delegated to by gates through which users travel.
 * Handles logic to determine whether users can travel through gates.
 * Does not make changes to users account balance but does call methods which
 * charge the users account for travel if applicable.
 * @author      Group C
 * @version     1.0
 * @since   04/03/2015
 * @serial (or @serialField or @serialData)     This class does not make use of serialization.
 */
public class PaymentHub {

    private Area area;     //this is the area location
    private TravelPoint parentTravel = null;
    private Vehicle parentVehicle = null;
    private int numGateways;
    private List<Gateway> gateways;

    /**
     * The constructor of PaymentHubs. Initialises vital member variables.
     * @param   parent a TravelPoint or Vehicle for which the PaymentHub functions
     * @param   numGateways a count of gateways to be initialised for this PaymentHub
     */
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

    /**
     * Uses a token ID to identify a user who is attempting to travel and inspects their account to see if they can travel though this travelpoint.
     * @param   tokenId the ID of a token to be searched for in the system.
     * @return  A boolean value, true for able to travel, false for travel denied.
     */
    public boolean canUserTravel(int tokenId) {
        Ticket ticket;
        UserAccount user;
        boolean hasPass;
        try {
            user = UserAccountManager.getInstance().getUserAccountByTokenId(tokenId);
            hasPass = user.checkActivePasses(getParentTravelPoint().getRoute());
        } catch (Exception e) {
            System.out.println("Null user in canUserTavel()");
            return false;
        }
        ticket = new Ticket(new Date());
        if (parentTravel != null) {
            System.out.println("On train");
            ticket.setValidFrom(parentTravel);
        }
        if (parentVehicle != null) {
            System.out.println("On Bus");
            ticket.setRoute(parentVehicle.getCurrentRoute());
            ticket.setValidFrom(parentVehicle.getTravelPoint());
        }
        if (!hasPass) {
            if (canUserAffordPayment(user)) {
                purchaseTicket(user);
                user.setActiveTicket(ticket);
                return true;
            } else {
                System.out.println("User can't afford payment and doesn't have pass");
                return false;
            }
        } else {
            user.setActiveTicket(ticket);
            return true;
        }
    }

    /**
     * Applies a ticket to a user account.
     * @param   ticket, the ticket to be matched to an account
     * @param   token, the tokenID of a user who the ticket should be matched to.
     */
    public void applyTicketToAcount(Ticket ticket, int token) {
        UserAccount user = UserAccountManager.getInstance().getUserAccountByTokenId(token);
        user.setActiveTicket(ticket);
    }
    
    /**
     * Compares travel cost for this paymentHub and the balance available for a given user
     * @param   user the ID of a token to be searched for in the system.
     * @return  true in the event of user having account greater than the travel cost.
     */
    private boolean canUserAffordPayment(UserAccount user) {
        System.out.println(user);
        System.out.println(getParentTravelPoint());
        System.out.println(getParentTravelPoint().getPrice());
        return user.canAccountBeDebited(getParentTravelPoint().getPrice());
    }
    
    /**
     * Automatically charges a user an amount based on member variables of this PaymentHub object when given a user account.
     * @param   user a UserAccount which will be charged.
     */
    private void purchaseTicket(UserAccount user) {
        Transaction transaction = new Transaction(Cash, getParentTravelPoint().getPrice(), new Date());
        user.makePayment(getParentTravelPoint().getPrice());
        user.addTransaction(transaction);
    }
    
    /**
     * Gets the location of this PaymentHub.
     * @return  TravelPoint the parent location of this PaymentHub if applicable.
     */
    private TravelPoint getParentTravelPoint() {
        return parentTravel != null ? parentTravel
                : parentVehicle.getTravelPoint();
    }
    
    /**
     * Determines whether the user currently has a valid pass or ticket allowing them to travel on the route on which this PaymentHub is situated and grants passage if they do.
     * @param   tokenId the ID of a token which matches the user who is attempting to travel.
     * @return  Boolean. True for passage allowed and false for passage disallowed. 
     */
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
    
    /**
     * Take an area to be assigned to this PaymentHub.
     * @param   a an area being passed in which is set to a member variable of the hub.
     */
    public void setArea(Area a) {
        area = a;
    }
    
    /**
     * Uses the given token ID to conduct a linear search for the first valid ticket owned by a user which would allow them to travel. When found clears this ticket which may incur an automatic charge. (See implementation of clear ticket)
     * @param   acct the account to be charged for travel and to be searched for a ticket.
     */
    void startAutomatedPayment(UserAccount acct) {
        List<Route> relevantRoutes = area.getRoutes();     //temp routes
        //tested, iterator methods works for purpose of function. No idea what the nested for stuff did but would always cause nullpointers.
        for (Iterator<Route> it = relevantRoutes.iterator(); it.hasNext();) {

            if (acct.checkActivePasses(it.next())) //implement
            {
                acct.clearActiveTicket();               //implement
                break;
            }

        }

//        for(Route r : area.getRoutes()){
//            for (TravelPoint tp : r.getTravelPoints()){
//                if(acct.checkActiveTicket(r, tp)){
//                    acct.clearActiveTicket();
//                }
//
//            }
//        }
    }
    
    /**
     * Uses a given gateway ID to search for a held gateway.
     * @param   i the ID of a gateway to be searched for.
     * @return  A Gateway reference which has the ID which was searched for.
     */
    public Gateway getGatewayById(int i) {
        return gateways.get(i);
    }
    
    /**
     * Gets an area which the PaymentHub is present in.
     * @return  Area an area which this PayMentHub is Present in.
     */
    public Area getArea() {
        return area;
    }
}
