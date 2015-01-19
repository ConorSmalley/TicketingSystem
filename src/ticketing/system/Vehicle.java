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
    private List<Gateway> gates;
    private Route assignedRoute;
    private PaymentHub paymentHub;
    private TravelPoint currentTravelPoint;
}
