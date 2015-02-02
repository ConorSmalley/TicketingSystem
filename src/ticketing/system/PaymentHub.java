/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

/**
 *
 * @author Conor
 */
class PaymentHub {

    public boolean canUserTravel(int tokenId) {
        UserAccount user = UserAccountManager.getUserAccountByToken(tokenId);
        if(canUserAffordPayment())
    }
    
}
