package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection class to store all the tickets and passes active in the system.
 */

public class TicketPassPool {
    private List<Ticket> tickets;
    private List<Pass> passes;

    public TicketPassPool(){
        tickets = new ArrayList();
        passes = new ArrayList();
    }
    
    void addTicket(Ticket t) {
        tickets.add(t);
    }

    void addPass(Pass p) {
        passes.add(p);
    }

    void removeTicket(Ticket t) {
        tickets.remove(t);
    }

    void removePass(Pass p) {
        passes.remove(p);
    }
}
