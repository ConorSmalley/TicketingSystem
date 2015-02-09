<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
class PaymentHub {
    private TravelPoint parent;
    private int numGateways;
    private List<Gateway> gateways;
    
    public PaymentHub(TravelPoint parent, int numGateways){
        this.parent = parent;
        gateways = new ArrayList();
        this.numGateways = numGateways;
        for(int i = 0; i < numGateways; i++)
            gateways.set(i, new EntryGate(new DigitalReader(), this));
    }

    public boolean canUserTravel(int tokenId) {
        Ticket ticket;
        UserAccount user = UserAccountManager.getUserAccountByTokenId(tokenId);
        if (user == null)
            return false;
        else{
            if (canUserAffordPayment(user)){
                ticket = new Ticket(new Date());
                ticket.setValidFrom(parent);
                user.setActiveTicket(ticket);
                return true;
            } else 
                return false;
        }
    }
    
    public void applyTicketToAcount(Ticket ticket, int token){
        UserAccount user = UserAccountManager.getUserAccountByTokenId(token);
        user.setActiveTicket(ticket);
    }

    private boolean canUserAffordPayment(UserAccount user) {
        return user.canAccountBeDebited(parent.getPrice());
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
class PaymentHub {
    private TravelPoint parent;
    private int numGateways;
    private List<Gateway> gateways;
    
    public PaymentHub(TravelPoint parent, int numGateways){
        this.parent = parent;
        gateways = new ArrayList();
        this.numGateways = numGateways;
        for(int i = 0; i < numGateways; i++)
            gateways.set(i, new EntryGate(new DigitalReader(), this));
    }

    public boolean canUserTravel(int tokenId) {
        Ticket ticket;
        UserAccount user = UserAccountManager.getUserAccountByToken(tokenId);
        if (user == null)
            return false;
        else{
            if (canUserAffordPayment(user)){
                ticket = new Ticket(new Date());
                ticket.setValidFrom(parent);
                user.setActiveTicket(ticket);
                return true;
            } else 
                return false;
        }
    }
    
    public void applyTicketToAcount(Ticket ticket, int token){
        UserAccount user = UserAccountManager.getUserAccountByToken(token);
        user.setActiveTicket(ticket);
    }

    public boolean canUserAffordPayment(UserAccount user) {
        return user.canAccountBeDebited(parent.getPrice());
    }

    public boolean canUserLeave(int tokenId) {
         //Acquires a user and retrieves current ticket
        UserAccount acct = (UserAccountManager.getUserAccountByToken(tokenId));
        Ticket ticket = acct.getActiveTicket();
        if (ticket == null)
        {return false;}
        ticket.setEndPoint(parent);
        return true;
    }

    void sartAutomatedPayment() {
        //List<Route> relevantRoutes;
        //parent.getArea().getRoutes()
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
>>>>>>> d626b7d66d745d036aea8c15559cd397b1b3a410
