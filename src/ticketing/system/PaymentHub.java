/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static ticketing.system.TransactionType.*;

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
        Transaction transaction;
        UserAccount user = UserAccountManager.getUserAccountByTokenId(tokenId);
        if (user == null)
            return false;
        else{
            if (canUserAffordPayment(user)){
                ticket = new Ticket(new Date());
                ticket.setValidFrom(parent);
                purchaseTicket(user, ticket);
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

    private void purchaseTicket(UserAccount user, Ticket ticket) {
        Transaction transaction = new Transaction(Cash, parent.getPrice(), new Date());
        user.makePayment(parent.getPrice());
        user.addTransaction(transaction);
    }
}
