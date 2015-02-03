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
public class DigitalReader {
    
    DigitalReader(Object parent){
        initialize();
    }
    
    public int scanToken(){
        return 123;
    }
    
    public void initialize(){
        System.out.println("initialized");
    }
}