<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;

/**
 *
 * @author Conor
 */
public class Ticket {
    private int id;
    private Route route;
    private Date purchaseDate;
    private TravelPoint validFrom;
    private TravelPoint validTo;
    
    public Ticket(int id, Route route, Date purchaseDate, TravelPoint validFrom, TravelPoint validTo){
        this.id = id;
        this.route = route;
        this.purchaseDate = purchaseDate;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    public Ticket(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    
    public Route getRoute(){
        return route;
    }
    
    public Date getPurchaseDate(){
        return purchaseDate;
    }
    
    public TravelPoint getValidFrom(){
        return validFrom;
    }
    
    public TravelPoint getValidTo(){
        return validTo;
    }
    
    //the valid duration of tickets is essentially defined here
    // valid to and from unused.. but are they supposed to be places or times
    public boolean isValidTicket(Route givenRoute, TravelPoint nextStop) {
        //if the next stop is in the ticket's planned route returns true. If this is wrong, the programmer needs more knowledge on the valdity of tickets
        return ( route.getTravelPoints().contains(nextStop) || givenRoute.getTravelPoints().containsAll(route.getTravelPoints()) );
    }    
        
    public void setValidFrom(TravelPoint validFrom) {
        this.validFrom = validFrom;
    }

    void setRoute(Route route) {
       this.route = route;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;

/**
 *
 * @author Conor
 */
public class Ticket {
    private int id;
    private Route route;
    private Date purchaseDate;
    private TravelPoint validFrom;
    private TravelPoint validTo;
    //private static final Duration = ;   ////.before or .after
    
    public Ticket(int id, Route route, Date purchaseDate, TravelPoint validFrom, TravelPoint validTo){
        this.id = id;
        this.route = route;
        this.purchaseDate = purchaseDate;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    public Ticket(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    
    public Route getRoute(){
        return route;
    }
    
    public Date getPurchaseDate(){
        return purchaseDate;
    }
    
    public TravelPoint getValidFrom(){
        return validFrom;
    }
    
    public TravelPoint getValidTo(){
        return validTo;
    }

    //the valid duration of tickets is essentially defined here
    // valid to and from unused.. but are they supposed to be places or times
    boolean isValidTicket(Route givenRoute, TravelPoint nextStop) {
        Date expiration = new Date();
        expiration.setTime((expiration.getTime() + (1000 * 60 * 60 * 24)));    // fails for daylight saving technically
        if (expiration.before(new Date()))
        {return false;}
        //if the next stop is in the ticket's planned route returns true. If this is wrong, the programmer needs more knowledge on the valdity of tickets
        if (givenRoute != null && nextStop != null)
        {return ( route.getTravelPoints().contains(nextStop) || givenRoute.getTravelPoints().containsAll(route.getTravelPoints()) );}
        else {return true;}
    }    
        
    public void setValidFrom(TravelPoint validFrom) {
        this.validFrom = validFrom;
    }

    void setEndPoint(TravelPoint parent) {
        validTo = parent;
    }
}
>>>>>>> d626b7d66d745d036aea8c15559cd397b1b3a410
