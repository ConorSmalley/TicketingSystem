package ticketing.system;

import java.util.Date;
import java.util.List;

/**
 * Makes use of a passPlan which determines which routes have been prepaid for.<p> Pertains to a user and retains its start date
 * to be used for determining the valid duration of a pass.
 */
public class Pass {

    private PassPlan passPlan;
    private int id;
    private Date startDate;

    public Pass(int id, PassPlan passPlan) {
        this.id = id;
        this.passPlan = passPlan;
        startDate = new Date(); //"now" by default
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
