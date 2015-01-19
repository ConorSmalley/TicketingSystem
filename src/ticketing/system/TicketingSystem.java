/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;
import static ticketing.system.TransactionType.Cash;

/**
 *
 * @author Conor
 */
public class TicketingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TransactionList tl = new TransactionList();
        tl.addtransaction(new Transaction(Cash, 10.50, new Date()));
        
        for(Transaction t : tl.getAllTransactions()){
            System.out.println(t);
        }
    }
    
}
