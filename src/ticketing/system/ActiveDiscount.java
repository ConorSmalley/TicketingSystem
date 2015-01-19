/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;

/**
 *
 * @author Curtis
 */
public class ActiveDiscount {
    private Discount discount;
    private Date startDate;
    
    public ActiveDiscount (Discount discount, Date startDate){
        this.discount = discount;
        this.startDate = startDate;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public Discount getDiscount(){
        return discount;
    }
}
