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
}
