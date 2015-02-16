/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class DigitalReader {

    DigitalReader(){
        initialize();
    }
    
    private InspectionDevice inspectionDevice;
    protected PaymentHub paymentHub;
    
    public int scanToken(){
        return 0;
         //presumably this should be a listener which passes a token to handleToken

    }
    
    public void setPaymentHub(PaymentHub paymentHubIn)
    {
        paymentHub = paymentHubIn;
    }
    
    public void setInspectionDevice(InspectionDevice inspectionDeviceIn)
    {
        inspectionDevice = inspectionDeviceIn;
    }
   
    public void initialize(){
        System.out.println("initialized");
    }
    

}
