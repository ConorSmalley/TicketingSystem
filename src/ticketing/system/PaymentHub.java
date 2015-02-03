/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;

/**
 *
 * @author Conor
 */
class PaymentHub {

    public boolean canUserTravel(int tokenId) {
        UserAccount user = UserAccountManager.getUserAccountByToken(tokenId);
        if (user == null)
            return false;
        else
            return canUserAffordPayment(user);
    }

    private boolean canUserAffordPayment(UserAccount user) {
        Ticket ticket = new Ticket(new Date());
        return true;
    }
    
}
