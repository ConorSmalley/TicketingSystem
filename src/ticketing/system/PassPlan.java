package ticketing.system;

import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Conor
 */
public class PassPlan {

    private int Id;
    private String name;
    private double price;
    //private TimeSpan ExpiryTime;
    private Date validStartTime;
    private Date validEndTime;
    private List<Route> routes;
    private Date deleted;

    public boolean isValid() {
        //This will check if the passplan is within the expiry date.
        return false;
    }

    public List<TravelPoint> getTravelPoints() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getValidLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
