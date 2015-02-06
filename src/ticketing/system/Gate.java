/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketing.system;


public class Gate 
{
    
    public Gate()
    {
        System.out.println("Gate created");
        
    }
    
    public void close()
    {
                System.out.println(this + "closed");

    }
    
    public void open()
    {
                System.out.println(this + "opened");

    }
        
    
}
