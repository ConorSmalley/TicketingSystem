/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

/**
 *
 * @author Conor
 */
class TravelPoint {
    private Route route;
    private int id;
    private String name;
    private String type;
    private PaymentHub paymenthub;
    public Area area;
    
    public TravelPoint(String name, Route route){
        this.name = name;
        this.route = route;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getType(){
        return type;
    }
    
    public double getPrice(){
       return route.getPrice();
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public Area getArea(){
        return area;
    }
    
    public void setArea(Area areaIn){
        area = areaIn;
    }
    
    
    
}
