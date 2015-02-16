/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
public class Area implements Serializable {

    private int Id;
    private String name;
    private List<TravelPoint> travelPoints = new ArrayList<>();
    private List<Route> routes = new ArrayList<>();
    private List<PassPlan> passPlans = new ArrayList<>();
    private TicketPassPool ticketPassPool;
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Infringement> infringements = new ArrayList<>();
    private List<InspectionDevice> inspectionDevices = new ArrayList<>();
    private static int IdCounter = 0;

    private static Area systemArea = null;

    Area(String name) {

        this.name = name;
        ticketPassPool = null;
    }

    public static Area getInstance() {
        if (systemArea == null) {
            systemArea = new Area("Area System");
        }
        return systemArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTravelPoint(TravelPoint t) {
        travelPoints.add(t);
    }

    public void removeTravelPoint(TravelPoint t) {
        travelPoints.remove(t);
    }

    public void addRoute(Route r) {
        routes.add(r);
    }

    public void removeRoute(Route r) {
        routes.remove(r);
    }

    public void addPassPlan(PassPlan p) {
        passPlans.add(p);
    }

    public void removePassPlan(PassPlan p) {
        passPlans.remove(p);
    }

    public void addTicketToPool(Ticket t) {
        ticketPassPool.addTicket(t);
    }

    public void addPassToPool(Pass p) {
        ticketPassPool.addPass(p);
    }

    public void removeTicketFromPool(Ticket t) {
        ticketPassPool.removeTicket(t);
    }

    public void removePassFromPool(Pass p) {
        ticketPassPool.removePass(p);
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean logInfringement(Date d, Route r, TravelPoint tp, int employeeNumber) {
        Infringement temp = new Infringement(d, r, tp, employeeNumber);
        infringements.add(temp);
        return true;
    }

    public void commitTransaction(Transaction tr) {

    }

    public List<Route> getRoutes() {
        return routes;
    }

    @Override
    public String toString() {
        return name;
    }
}
