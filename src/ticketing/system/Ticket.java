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
}
