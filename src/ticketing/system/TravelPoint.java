package ticketing.system;

/**
 * A location which the system serves.</br> Users may be charges from these locations,
 * they may be logged as embarking on transport from them and leaving transport from them.</br>
 * TravelPoints also make up routes through which vehicles travel.</br>
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
