/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Conor
 */
public class TravelPointTest {

    private static final double PRICE = 1.70;
    private static final String NAME = "Hallam";
    private static final Route r = new Route(1, "25A", "Woodhouse - Bradway", PRICE, 3, 0.5);
    private static final TravelPoint tp = new TravelPoint(NAME, r);
    private static final Area a = new Area("Sheffield");
    private static final String TYPE = "Bus Stop";

    public TravelPointTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        tp.setArea(a);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tp.setArea(a);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class TravelPoint.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = NAME;
        String result = tp.getName();
        assertSame(expResult, result);
    }

    /**
     * Test of setName method, of class TravelPoint.
     */
    @Test
    public void testSetName() {
        String newName = "HallamNew";
        System.out.println("setName");
        tp.setName(newName);
        String expResult = newName;
        String result = tp.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class TravelPoint.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = PRICE;
        double result = tp.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setType method, of class TravelPoint.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        tp.setType(TYPE);
        String expResult = TYPE;
        String result = tp.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class TravelPoint.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        String result = tp.getType();
        String expResult = TYPE;
        assertSame(expResult, result);
    }

    /**
     * Test of getRoute method, of class TravelPoint.
     */
    @Test
    public void testGetRoute() {
        System.out.println("getRoute");
        Route expResult = r;
        Route result = tp.getRoute();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArea method, of class TravelPoint.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        Area expResult = new Area("test");
        tp.setArea(expResult);
        Area result = tp.getArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class TravelPoint.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Area expResult = a;
        Area result = tp.getArea();
        assertEquals(expResult, result);
    }
}
