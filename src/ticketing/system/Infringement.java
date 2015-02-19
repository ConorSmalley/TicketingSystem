package ticketing.system;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Conor
 */
public class Infringement {

    private final Date d;
    private final Route r;
    private final TravelPoint tp;
    private final int en;

    Infringement(Date d, Route r, TravelPoint tp, int en) {
        this.d = d;
        this.r = r;
        this.tp = tp;
        this.en = en;
        System.out.println("Infringement created by: " + EmployeeAccountManager.getInstance().getEmployeeById(en).toString() + " on route " + r.toString() + " at travel point " + tp.getName());
    }

    @Override
    public String toString() {
        return EmployeeAccountManager.getInstance().getEmployeeById(en).toString();

    }
}
