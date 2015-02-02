/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Conor
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
