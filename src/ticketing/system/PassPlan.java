package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Definition of what a plan will give a user free access to when travelling.</br>
 * Is not an instance of a user's pass. Each pass will have a pass plan.</br>
 * Defines a plan's price. Defines duration of a pass.</br>
 */
public class PassPlan {

    private int id;
    private String name;
    private double price;
    private Date expiryDate;
    private int lengthInDays;
    private Date validStartTime;
    private Date validEndTime;
    private List<Route> routes;
    private Date deleted;

    public PassPlan(int id, String name, double price, int length, Date expirydDate, Date startTime, Date endTime){
        this.id = id;
        this.name = name;
        this.price = price;
        this.lengthInDays = length;
        this.expiryDate = expiryDate;
        routes = new ArrayList();
        this.validStartTime = startTime;
        this.validEndTime = endTime;
    }
    
    public boolean isValid() {
        return (expiryDate.after(new Date()));
    }

    public List<TravelPoint> getTravelPoints() {
        List<TravelPoint> tp = new ArrayList();
        for (Route i : routes){
            tp.addAll(i.getTravelPoints());
        }
        return tp;
    }

    public String getName() {
        return name;
    }

    int getValidLength() {
        return lengthInDays;
    }
}
