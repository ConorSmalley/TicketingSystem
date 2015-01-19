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
class Route {
    private int Id;
    private String name;
    private List<TravelPoint> travelPoints;
    private double price;
    private int shortJourneyMaxStops;
    private double shortJourneyDiscount;
    private List<Vehicle> assignedVehicles;
}
