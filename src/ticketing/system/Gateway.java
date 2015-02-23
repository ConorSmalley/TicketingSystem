package ticketing.system;

import java.util.ArrayList;

/**
 * An abstract to be derived from as an implementation of a specialised gateway.</br>
 * Constructors ensure gateways have a relevant paymentHub and token reader. </br>
 */
public abstract class Gateway{
    private int id;
    private DigitalReader reader;
    private GatewayGUI gui;
    private static int nextId = 0;
    protected PaymentHub paymentHub;
    
    public Gateway(DigitalReader reader, PaymentHub paymentHub){
        this.reader = reader;
        this.id = ++nextId;
        this.paymentHub = paymentHub;
    }
    
    public abstract boolean handleToken(int tokenId);
    
    public int getId(){
        return this.id;
    }
    
    public void openGate(){
        System.out.println("Gate " + id + " opened");
        
    }
    
    public void closeGate(){
        System.out.println("Gate " + id + " close");
        
    }

    public PaymentHub getPaymentHub() {
        return paymentHub;
    }

    public DigitalReader getReader() {
        return reader;
    }
}
