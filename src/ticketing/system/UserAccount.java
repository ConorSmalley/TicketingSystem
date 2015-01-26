/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
public class UserAccount implements Serializable {

    private int Id;
    private Person person;
    private double balance;
    private double availableBalance;
    private Ticket activeTicket;
    private List<Pass> passes;
    private ActiveDiscount currentActiveDiscount;
    private List<Token> tokens;
    private TransactionList transactionList;
    private Date deleted;

    UserAccount() {
        activeTicket = null;
    }

    public Person getPersonData() {
        return person;
    }

    public int getId() {
        return Id;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public List<Pass> getAllPasses() {
        return passes;
    }

    public void savePersonData(Person p) {
        person = p;
    }

    public void updateBalance(double b) {
        balance = b;
    }

    public void updateAvailableBalance(double b) {
        availableBalance = b;
    }

    public Ticket getActiveTicket() {
        return activeTicket;
    }

    public void setActiveTicket(Ticket t) {
        activeTicket = t;
    }
    public List<Pass> getPasses(){
        return passes;
    }
    public List<Pass> getPassesForDateRange(){
        //TODO: THis fucntion needs to be finished
        return null;
    }
    public void addPass(Pass p){
        passes.add(p);
    }
    public void applyDiscount(ActiveDiscount d){
        currentActiveDiscount = d;
    }
    public void addToken(Token t){
        tokens.add(t);
    }
    public void removeToken(Token t){
        for(Token to:tokens){
            if(to == t){
                tokens.remove(t);
            }
        }
    }
    public void removeTokenById(int id){
        for(Token t:tokens){
            if(t.getId()==id){
                tokens.remove(t);
            }
        }
    }
}
