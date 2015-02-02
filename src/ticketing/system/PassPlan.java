package ticketing.system;

import java.util.ArrayList;
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
