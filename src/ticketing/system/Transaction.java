/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;

/**
 *
 * @author Conor
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
}
