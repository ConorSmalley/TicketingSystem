/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

/**
 *
 * @author Curtis
 */
public class Discount {
    private int id;
    private String name;
    private double discountPercentage;
    private int validLenth;
    
    public Discount(int id, String name, double discountPercentage, int validUntil) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.validLenth = validUntil;
    }
    
    public String getName(){
        return name;
    }
    
    public int getValidUntil (){
        return validLenth;
    }
    
    public double getDiscountPercentage(){
        return discountPercentage;
    }
}
