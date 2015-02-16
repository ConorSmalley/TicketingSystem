/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.List;

/**
 *
 * @author Conor
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
        this.gateway = new EntryGate(new DigitalReader(), paymentHub);
        assignedRoute = route;
        currentTravelPoint = null;
    }

    public void setRoute(Route r) {
        assignedRoute = r;
    }
    
    public Route getRoute(){
        return assignedRoute;
    }

    public Route getCurrentRoute() {
        return assignedRoute;
    }

    public TravelPoint getTravelPoint() {
        return currentTravelPoint;
    }
}
