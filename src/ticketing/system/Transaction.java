package ticketing.system;

import java.util.Date;

/**
 * A record of a transaction of real money.<p> May be a change of balance stored
 * for a user.<p> Stores data and method of payment.
 */
public class Transaction {

    private int id;
    private TransactionType type;
    private double Amount;
    private Date datePurchased;
    
    Transaction(TransactionType type, double Amount, Date datePurchased) {
        id = TransactionList.getNextId();
        this.type = type;
        this.Amount = Amount;
        this.datePurchased = datePurchased;
    }
    public int getId(){
        return id;
    }

    void setId(int id) {
        this.id = id;
    }
    
    public TransactionType getType(){
        return type;
    }
    
    public double getAmount(){
        return Amount;
    }
            
    public Date getDatePurschased(){
        return datePurchased;
    }
    
}
