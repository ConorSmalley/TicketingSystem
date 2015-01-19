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
public class UserAccount {
    private int Id;
    private Person person;
    private double balance;
    private boolean availableBlance;
    private Ticket activeTicket;
    private List<Pass> passes;
    private ActiveDiscount currentActiveDiscount;
    private List<Token> tokens;
    private TransactionList transactionList;
    private Date deleted;
    UserAccount() {

    }
}
