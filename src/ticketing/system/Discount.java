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
public class Discount {
    private int id;
    private String name;
    private double discountPercentage;
    private Date validUntil;
    
    public Discount(int id, String name, double discountPercentage, Date validUntil) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.validUntil = validUntil;
    }
    
    public String getName(){
        return name;
    }
    
    public Date getValidUntil (){
        return validUntil;
    }
    
    public double getDiscountPercentage(){
        return discountPercentage;
    }
}
