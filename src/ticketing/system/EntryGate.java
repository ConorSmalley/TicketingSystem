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
    PaymentHub paymentHub;

    
    public EntryGate(DigitalReader reader){
        super(reader);
    }
    
    
    public void handleTokenOnEntry(int tokenId){
        
    }
}
