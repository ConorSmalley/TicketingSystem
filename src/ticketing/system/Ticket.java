package ticketing.system;

import java.util.Date;

/**
 * A ticket which may be actively updated which a start and end point.<p>
 * The data of route, start and endpoint of this ticket will be used to charge.<p>
 * A user for travel when the tickets usage ends in the even of ticket being 
 * purchased by a registered system user. 
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
        
    public void setValidFrom(TravelPoint validFrom) {
        this.validFrom = validFrom;
    }

    void setRoute(Route route) {
       this.route = route;
    }

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

    void setEndPoint(TravelPoint parent) {
        validTo = parent;
    }
}
