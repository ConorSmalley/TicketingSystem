package ticketing.system;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public abstract class Gateway{
    private int id;
<<<<<<< HEAD
    
    private DigitalReader reader;
=======
<<<<<<< HEAD
    DigitalReader reader;
    private Gate gate;
=======
    private DigitalReader reader;
>>>>>>> 286da8dd50434acf0a70e752962877486df808dd
>>>>>>> master
    private GatewayGUI gui;
    private static int nextId = 0;
    private PaymentHub paymentHub;
    
    public Gateway(DigitalReader reader, PaymentHub paymenthub){
        this.reader = reader;
        this.id = ++nextId;
        this.paymentHub = paymentHub;
    }
    
    public abstract void handleToken(int tokenId);
    
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

    public PaymentHub getPaymentHub() {
        return paymentHub;
    }

    public DigitalReader getReader() {
        return reader;
    }
}
