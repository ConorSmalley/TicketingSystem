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
public class EmployeeAccountManagerTest {

    private static final Employee a = new Employee("Conor", 1, "password1");
    private static final Employee b = new Employee("Curtis", 2, "password2");
    private static final Employee c = new Employee("Andrew", 3, "password3");
    private static final EmployeeAccountManager eam = EmployeeAccountManager.getInstance();

    public EmployeeAccountManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        EmployeeAccountManager.getInstance().addEmployee(a);
        EmployeeAccountManager.getInstance().addEmployee(b);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class EmployeeAccountManager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");

        EmployeeAccountManager expResult = eam;
        EmployeeAccountManager result = EmployeeAccountManager.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of addEmployee method, of class EmployeeAccountManager.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        EmployeeAccountManager instance = EmployeeAccountManager.getInstance();

        instance.addEmployee(c);
        Employee expResult = c;
        Employee result = instance.getEmployeeById(c.getId());

        assertEquals(expResult, result);
    }

    /**
     * Test of removeEmployee method, of class EmployeeAccountManager.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("removeEmployee");
        EmployeeAccountManager instance = EmployeeAccountManager.getInstance();
        instance.removeEmployee(b);
        Employee result = instance.getEmployeeById(b.getId());
        Employee expResult = null;
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmployeeById method, of class EmployeeAccountManager.
     */
    @Test
    public void testGetEmployeeById() {
        System.out.println("getEmployeeById");
        int id = 0;
        EmployeeAccountManager instance = EmployeeAccountManager.getInstance();
        Employee expResult = a;
        Employee result = instance.getEmployeeById(1);
        assertEquals(expResult, result);
    }

}
