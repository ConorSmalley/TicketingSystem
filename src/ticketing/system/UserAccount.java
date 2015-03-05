package ticketing.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static ticketing.system.TransactionType.Card;

/**
 * An account which pertains to a real person.<p>
 * This account stores the balance a person has available to spend on travel.<p>
 * Stored also are: Passes which the user has active; Tokens which can be used to identify a user;
 * A reference to a storage class for transactions the user has made; The one ticket which is currently active.
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
        transactionList = new TransactionList();
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

    public void setBalance(double b) {
        balance = b;
    }
    
    public void updateBalance(double b){
        balance = balance + b;
    }

    public void updateAvailableBalance(double b) {
        availableBalance = b;
    }

    public double getBalance() {
        return balance;
    }

    public Ticket getActiveTicket() {
        return activeTicket;
    }

    public void setActiveTicket(Ticket t) {
        activeTicket = t;
    }

    public List<Pass> getPasses() {
        return passes;
    }

    //requires logic programming    //shouldn't this be in UserAccountManager actually?
    public List<Pass> getAllActivePasses() {
        return passes;
    }

    public List<Pass> getPassesForDateRange() {
        //TODO: THis fucntion needs to be finished
        return null;
    }

    public void addPass(Pass p) {
        passes.add(p);
    }

    public void applyDiscount(ActiveDiscount d) {
        currentActiveDiscount = d;
    }

    public void addToken(Token t) {
        tokens.add(t);
    }

    public void removeToken(Token t) {
        for (Token to : tokens) {
            if (to == t) {
                tokens.remove(t);
            }
        }
    }

    public void removeTokenById(int id) {
        for (Token t : tokens) {
            if (t.getId() == id) {
                tokens.remove(t);
            }
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + person.toString() + " Balance: " + balance;
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
        return balance >= price;

    }

    void addTransaction(Transaction transaction) {
        transactionList.addtransaction(transaction);
    }

    void makePayment(double price) {
        balance -= price;
    }

    void clearActiveTicket() {

        //logic to calculate a ticket price not determined or implemented.
        //should be calculable due to ticket.start and ticket.end
        //using these to determine the route traveled possibly
        //next discounts may be applied     
        //Best design owuld be:
        //this method passes ticket endpoint, ticket startpoint and this accounts passes (for discounts) to a class which handles travel costs
        //the cost calculator returns a price for travel based on the cheapest travel using passes given
        //the charge is applied to the account and transaction added to this accounts transaciton list
        //PLACEHOLDER CODE:
        double thisTravelCost = 0;

        thisTravelCost = 5.0;
        transactionList.addtransaction(new Transaction(Card, thisTravelCost, new Date()));
        //naive about implementation of balance and availible balance
        balance -= thisTravelCost;
        activeTicket = null;
    }
}
