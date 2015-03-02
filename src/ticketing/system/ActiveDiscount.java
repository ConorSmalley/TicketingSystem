package ticketing.system;

import java.util.Date;

/**
 * Active discounts are uses of Discounts.<p>
 * UserAccounts may have active discounts applied to them.
 * 
 */
public class ActiveDiscount {
    private Discount discount;
    private Date startDate;
    private int Id;
    private static int nextId = 0;
        
    public ActiveDiscount (Discount discount, Date startDate){
        this.discount = discount;
        this.startDate = startDate;
        this.Id = ++nextId;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public Discount getDiscount(){
        return discount;
    }
    
    public int getId(){
        return this.Id;
    }
 
}
