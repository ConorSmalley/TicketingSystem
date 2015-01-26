
package ticketing.system;

/**
* Discounts are definitions for the reduction in the costs of travelling
* Discounts are added and removed by the administration of the system
* When applied, they are referred to through ActiveDiscount`s
*   after the active date has been validated, to get the discount percentage
 */
public class Discount {
    private int id;
    private String name;
    private double discountPercentage;  //within the range 0 to 100
    private int validLenth;         //A number of hours for which the discount shall be valid

    
    public Discount(int id, String name, double discountPercentage, int validUntil) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.validLenth = validUntil;
    }
    
    public String getName(){
        return name;
    }
    //returns a length in hours
    public int getValidLenth() {
        return validLenth;
    }
    //returns a discount between 0 and 100 percent
    public double getDiscountPercentage(){
        return discountPercentage;
    }  
    
    public int getId() {
        return id;
    }
    
}
