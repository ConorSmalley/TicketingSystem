package ticketing.system;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Gateway {
    private int id;
    DigitalReader reader;
    private Gate gate;
    private GatewayGUI gui;
    private static int nextId = 0;
    static PaymentHub paymentHub = new PaymentHub();
    
    public Gateway(DigitalReader reader){
        this.reader = reader;
        this.id = ++nextId;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void openGate(){
        System.out.println("Gate " + id + " opened");
        gate.open();
    }
    
    public void closeGate(){
        System.out.println("Gate " + id + " close");
        gate.close();
    }
}
