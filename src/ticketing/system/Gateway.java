package ticketing.system;
/**
 *
 * @author Andrew
 */
public abstract class Gateway{
    private int id;
    DigitalReader reader;
    private GatewayGUI gui;
    private static int nextId = 0;
    PaymentHub paymentHub = new PaymentHub();
    
    public Gateway(DigitalReader reader){
        this.reader = reader;
        this.id = ++nextId;
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
}
