/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Curtis
 */
public class PaymentHubTest {
    
    private static UserAccountManager usrAccMgr = UserAccountManager.getInstance();
    private UserAccount user;
    Ticket ticket;
    
    public PaymentHubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Area area = new Area("Sheffield");
        UserAccount user = new UserAccount();
        user.setBalance(10);
        user.savePersonData(new Person("Andrew"));
        user.addToken(new Token(0));
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        area.addRoute(r);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        TravelPoint tp2 = new TravelPoint("Sheffield" , r);
         ticket = new Ticket(123, r, new Date(), tp, tp2);
        user.setActiveTicket(ticket);
        usrAccMgr.addUserAccount(user);
    }
    
    @After
    public void tearDown() {
        usrAccMgr.deleteUserAccount(user);
        user = null;
    }

    /**
     * Test of canUserTravel method, of class PaymentHub.
     */
    @Test
    public void testCanUserTravel() {
        System.out.println("canUserTravel");
        int tokenId = 0;
        PaymentHub instance = new PaymentHub(new TravelPoint("Hilsborough", new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5)), 1);
        boolean expResult = true;
        boolean result = instance.canUserTravel(tokenId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of applyTicketToAcount method, of class PaymentHub.
     */
    @Test
    public void testApplyTicketToAcount() {
        System.out.println("applyTicketToAcount");
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        TravelPoint tp2 = new TravelPoint("Sheffield" , r);
        Ticket ticket = new Ticket(123, r, new Date(), tp, tp2);
        int token = 0;
        PaymentHub instance = new PaymentHub(tp, 1);
        instance.applyTicketToAcount(ticket, token);
        
        Ticket expResult = ticket;
        Ticket result = usrAccMgr.getUserAccountByTokenId(token).getActiveTicket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canUserLeave method, of class PaymentHub.
     */
    @Test
    public void testCanUserLeave() {
        System.out.println("canUserLeave");
        int tokenId = 0;
        Area area = new Area("Sheffield");
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        area.addRoute(r);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        PaymentHub instance = new PaymentHub(tp, 1);
        instance.setArea(area);
        boolean expResult = true;
        boolean result = instance.canUserLeave(tokenId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class PaymentHub.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        Area a = new Area("Sheffield");
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        PaymentHub instance = new PaymentHub(tp, 1);
        instance.setArea(a);
        Area expResult = a;
        Area result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of startAutomatedPayment method, of class PaymentHub.
     */
    @Test
    public void testStartAutomatedPayment() {
        System.out.println("startAutomatedPayment");
        UserAccount acct = usrAccMgr.getUserAccountById(0);
        acct.setActiveTicket(ticket);
        Area area = new Area("Sheffield");
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        area.addRoute(r);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        PaymentHub instance = new PaymentHub(tp, 1);
        instance.setArea(area);
        instance.startAutomatedPayment(acct);
        Ticket expResult = ticket;
        Ticket result = acct.getActiveTicket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getGatewayId method, of class PaymentHub.
     */
    @Test
    public void testGetGatewayId() {
        System.out.println("getGatewayId");
        int i = 0;
        Route r = new Route(0, "60" ,"Shefield - Hilsborough", 5, 2, 0.5);
        TravelPoint tp = new TravelPoint("Hilsborough", r);
        PaymentHub instance = new PaymentHub(tp, 1);
        Gateway expResult = instance.getGatewayById(i);
        Gateway result = instance.getGatewayById(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
