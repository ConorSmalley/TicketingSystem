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

    Date d;
    Route r;
    TravelPoint tp;
    int en;

    Infringement(Date d, Route r, TravelPoint tp, int en) {
        this.d = d;
        this.r = r;
        this.tp = tp;
        this.en = en;
    }

}
