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
public class ExitGate extends Gateway{
    
    public ExitGate(DigitalReader reader, PaymentHub paymentHub){
        super(reader, paymentHub);
    }

    @Override
    public void handleToken(int tokenId) {
        if (super.paymentHub.canUserLeave(tokenId))
        {
        //call GUI success
        super.openGate();

        }
        
        super.paymentHub.sartAutomatedPayment();
        
        
               
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    
    }
    
    
}
