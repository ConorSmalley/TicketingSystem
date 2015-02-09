<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
public class UserAccount implements Serializable {

    private int id;
    private Person person;
    private double balance;
    private double availableBalance;
    private Ticket activeTicket;
    private List<Pass> passes;
    private ActiveDiscount currentActiveDiscount;
    private List<Token> tokens;
    private TransactionList transactionList;
    private Date deleted;
    private static int idCount = UserAccountManager.getNumberOfUsers();
    
    UserAccount() {
        activeTicket = null;
        passes = new ArrayList();
        tokens = new ArrayList();
        id = idCount++;
        balance = 0;
    }

    public Person getPersonData() {
        return person;
    }

    public int getId() {
        return id;
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
    
   
    //requires logic programming    //shouldn't this be in UserAccountManager actually?
    public List<Pass> getAllActivePasses(){
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
    @Override
    public String toString(){
        return "Id: " + id + " Name: " + person.toString();
    }
    
    public boolean checkActivePasses(Route assignedRoute) {

            for (Pass thisPass : this.getAllPasses()) {
                if (thisPass.getTravelPoints().containsAll(assignedRoute.getTravelPoints())) //can be replaced with "isPartOf"
                {
                    return true;
                }
            }
       return false;
    }

    boolean checkActiveTicket(Route assignedRoute, TravelPoint nextStop) {
        return activeTicket.isValidTicket(assignedRoute, nextStop);
    }
    
    public boolean canAccountBeDebited(double price) {
        return balance > price;

    }

    void addTransaction(Transaction transaction) {
        transactionList.addtransaction(transaction);
    }
    
    void makePayment(double price){
        balance -= price;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Conor
 */
public class UserAccount implements Serializable {

    private int id;
    private Person person;
    private double balance;
    private double availableBalance;
    private Ticket activeTicket;
    private List<Pass> passes;
    private ActiveDiscount currentActiveDiscount;
    private List<Token> tokens;
    private TransactionList transactionList;
    private Date deleted;
    private static int idCount = UserAccountManager.getNumberOfUsers();
    
    UserAccount() {
        activeTicket = null;
        passes = new ArrayList();
        tokens = new ArrayList();
        id = idCount++;
        balance = 0;
    }

    public Person getPersonData() {
        return person;
    }

    public int getId() {
        return id;
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
        if (activeTicket.isValidTicket(null, null))
        {return activeTicket;}
        else 
        {return null;}        
    }

    public void setActiveTicket(Ticket t) {
        activeTicket = t;
    }
    
    public List<Pass> getPasses(){
        return passes;
    }
    
   
    //requires logic programming    //shouldn't this be in UserAccountManager actually?
    public List<Pass> getAllActivePasses(){
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
    @Override
    public String toString(){
        return "Id: " + id + " Name: " + person.toString();
    }


    public boolean checkActivePasses(Route assignedRoute) {

            for (Pass thisPass : this.getAllPasses()) {
                if (thisPass.getTravelPoints().containsAll(assignedRoute.getTravelPoints())) //can be replaced with "isPartOf"
                {
                    return true;
                }
            }
       return false;
    }

    boolean checkActiveTicket(Route assignedRoute, TravelPoint nextStop) {
        return activeTicket.isValidTicket(assignedRoute, nextStop);
    }

    public boolean canAccountBeDebited(double price) {
        return balance > price;

    }
}
>>>>>>> d626b7d66d745d036aea8c15559cd397b1b3a410
