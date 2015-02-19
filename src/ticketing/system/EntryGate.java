
package ticketing.system;

/**
 * An implementation of Gateway which specifically calls on a relevant
 * PaymentHub to set a start point for a users ticket.
 * 
 */
public class EntryGate extends Gateway {
    String memberName;
    
    public EntryGate(DigitalReader reader, PaymentHub paymenthub){
        super(reader, paymenthub);
    }
 
    @Override
    public void handleToken(int tokenId){
        if (super.getPaymentHub().canUserTravel(tokenId)){
            super.openGate();
        }
    }
}
