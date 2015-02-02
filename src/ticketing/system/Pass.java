/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.List;

/**
 *
 * @author Conor
 */
public class Pass {

    private PassPlan passPlan;
    private int id;

    public Pass(int id, PassPlan passPlan) {
        this.id = id;
        this.passPlan = passPlan;
    }
    
    public PassPlan getPassPlan(){
        return passPlan;
    }
    
    public List<TravelPoint> getTravelPoints(){
        return passPlan.getTravelPoints();
    }
    
    public String getPassName(){
        return passPlan.getName();
    }
    
    public int getValidLength(){
        return passPlan.getValidLength();
    }
}
