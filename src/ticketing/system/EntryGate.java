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
public class EntryGate extends Gateway {
    String memberName;
    
    public EntryGate(DigitalReader reader, PaymentHub paymenthub){
        super(reader, paymenthub);
    }
 
    @Override
    public void handleToken(int tokenId){
        if (super.getPaymentHub().canUserTravel(super.getReader().scanToken())){
            super.openGate();
        }
    }
}
