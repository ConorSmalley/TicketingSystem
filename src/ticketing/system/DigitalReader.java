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
public class DigitalReader{
    private Object parentDevice;
    
    DigitalReader(Object parent){
        if(parent.getClass() == Gateway.class){
            parentDevice = (Gateway) parent;
        } else if(parent.getClass() == InspectionDevice.class){
            parentDevice = (InspectionDevice) parent;
        }
    }
    public void scanToken(){
        int tokenId = 123;
        parentDevice.handleToken(tokenId);
    }
    public String initialize(){
        return null;
    }
}
