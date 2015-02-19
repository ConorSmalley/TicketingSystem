/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
class Route {

    private int id;
    private String routeNo;
    private String name;
    private List<TravelPoint> travelPoints;
    private double price;
    private int shortJourneyMaxStops;
    private double shortJourneyDiscount;
    private List<Vehicle> assignedVehicles;

    public Route(int id, String routeNo, String name, double price, int shortJourneyMaxStops,
            double shortJourneyDiscount) {
        this.id = id;
        this.routeNo = routeNo;
        this.name = name;
        this.price = price;
        this.shortJourneyMaxStops = shortJourneyMaxStops;
        this.shortJourneyDiscount = shortJourneyDiscount;
        travelPoints = new ArrayList();
        assignedVehicles = new ArrayList();
    }

    //incomplete and untested
    public static boolean isPartOf(Route subRoute, Route aRoute) {
        return aRoute.travelPoints.containsAll(subRoute.travelPoints);
    }

    public int getId() {
        return id;
    }

    public List<TravelPoint> getTravelPoints() {
        return travelPoints;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShortJourneyMaxStops() {
        return shortJourneyMaxStops;
    }

    public double getShortJourneyDiscount() {
        return shortJourneyDiscount;
    }

    public List<Vehicle> getAssignedVihicles() {
        return assignedVehicles;
    }

    public void addVehicle(Vehicle v) {
        assignedVehicles.add(v);
    }

    public void addTravelPoint(TravelPoint t) {
        travelPoints.add(t);
    }

    public void removeVehicle(Vehicle v) {
        assignedVehicles.remove(v);
    }

    public void removeTravelPoint(TravelPoint t) {
        travelPoints.remove(t);
    }

    public String getRouteNo() {
        return routeNo;
    }

    @Override
    public String toString() {
        return routeNo + "," + name;
    }

    public TravelPoint getStart() {
        return travelPoints.get(0);
    }
    
    public TravelPoint getNextTravelPoint(TravelPoint t){
        return travelPoints.get(travelPoints.indexOf(t)+1);
    }
}
