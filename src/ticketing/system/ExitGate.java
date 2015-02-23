
package ticketing.system;

/**
 * An implementation of Gateway which specifically calls on a relevant
 * PaymentHub to set the endpoint of a users tickets journey which may also
 * charge user for their journey.</br>
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
                
    }
    
    
}
