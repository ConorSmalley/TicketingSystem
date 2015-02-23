
package ticketing.system;

/**
 * An implementation of Gateway which specifically calls on a relevant
 * PaymentHub to set a start point for a users ticket.</br>
 * 
 */
public class EntryGate extends Gateway {
    String memberName;
    
    public EntryGate(DigitalReader reader, PaymentHub paymenthub){
        super(reader, paymenthub);
        System.out.println(paymentHub);
    }
 
    @Override
    public boolean handleToken(int tokenId){
        System.out.println(paymentHub);
        if (paymentHub.canUserTravel(tokenId)){
            super.openGate();
            return true;
        }
        return false;
    }
}
