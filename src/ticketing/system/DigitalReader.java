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
<<<<<<< HEAD
public class DigitalReader implements ActionListener{
=======
public class DigitalReader {
    
>>>>>>> 286da8dd50434acf0a70e752962877486df808dd
    DigitalReader(){
        initialize();
    }
    
    public int scanToken(){
<<<<<<< HEAD
        
        
        return 0;
    }
    public String initialize(){
        
        
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
=======
        return 123;
    }
    
    public void initialize(){
        System.out.println("initialized");
    }
}
>>>>>>> 286da8dd50434acf0a70e752962877486df808dd
