/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
public class TransactionList {

    public List<Transaction> transactions;

    TransactionList() {

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

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public List<Transaction> getTransactionRange(Date start, Date finish) {
        return transactions;
    }
}
