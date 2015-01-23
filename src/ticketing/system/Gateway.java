/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketing.system;

/**
 *
 * @author Andrew
 */
public class Gateway {
    private int id;
    private DigitalReader reader;
    private GatewayGUI gui;
    private static int nextId = 0;
    
    public Gateway(DigitalReader reader){
        this.reader = reader;
        this.id = ++nextId;
    }
    
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
