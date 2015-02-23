package ticketing.system;

import java.util.List;

/**
 * -Software which manages a real world vehicle -Each vehicle has a paymentHub
 * and gateway which -Vehicles also record the route they're travelling on
 * -Also stores the current location of a vehicles to be used to properly charge a user's ticket.
 * 
 */
class Vehicle {

    private int Id;
    private Gateway gateway;
    private Route assignedRoute;
    private PaymentHub paymentHub;
    private TravelPoint currentTravelPoint;
    private static int vehicleId = 0;
    
    Vehicle(Route route) {
        Id = ++vehicleId;
        paymentHub = new PaymentHub(this, 1);
        gateway = paymentHub.getGatewayId(0);
        assignedRoute = route;
        currentTravelPoint = route.getStart();
    }

    public void setRoute(Route r) {
        assignedRoute = r;
    }
    
    public Route getRoute(){
        return assignedRoute;
    }

    public Gateway getGateway(){
        return gateway;
    }
    
    public Route getCurrentRoute() {
        return assignedRoute;
    }

    public TravelPoint getTravelPoint() {
        return currentTravelPoint;
    }
}
