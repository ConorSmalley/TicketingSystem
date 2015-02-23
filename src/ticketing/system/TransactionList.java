
package ticketing.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A storage class for transactions.
 */
public class TransactionList {

    private List<Transaction> transactions;
    public static int idCount;
    
    TransactionList() {
        transactions = new ArrayList<>();
        idCount = transactions.size();
    }

    public void addtransaction(Transaction t) {
        transactions.add(t);
    }

    public void removeTransaction(Transaction t) {
        transactions.remove(t);
    }

    public void removeTransactionById(int Id) {
        for (Transaction t : transactions) {
            if (t.getId() == Id) {
                transactions.remove(t);
            }
        }
    }

    public static int getNextId(){
        return idCount++;
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public List<Transaction> getTransactionRange(Date start, Date finish) {
        return transactions;
    }
}
