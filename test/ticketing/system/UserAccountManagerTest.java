/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.List;
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
public class UserAccountManagerTest {
    
    private static UserAccount andrew = new UserAccount();
    private static UserAccountManager instance = UserAccountManager.getInstance();
    
    public UserAccountManagerTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        andrew.savePersonData(new Person("Andrew"));
        instance.addUserAccount(andrew);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance.addUserAccount(andrew);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class UserAccountManager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserAccountManager expResult = instance;
        UserAccountManager result = UserAccountManager.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfUsers method, of class UserAccountManager.
     */
    @Test
    public void testGetNumberOfUsers() {
        System.out.println("getNumberOfUsers");
        int expResult = 1;
        int result = instance.getNumberOfUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUserAccount method, of class UserAccountManager.
     */
    @Test
    public void testAddUserAccount() {
        System.out.println("addUserAccount");
        UserAccount u = new UserAccount();
        u.savePersonData(new Person("Curtis"));
        instance.addUserAccount(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserAccount method, of class UserAccountManager.
     */
    @Test
    public void testDeleteUserAccount() {
        System.out.println("deleteUserAccount");
        UserAccount u = andrew;
        instance.deleteUserAccount(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserAccountById method, of class UserAccountManager.
     */
    @Test
    public void testDeleteUserAccountById() {
        System.out.println("deleteUserAccountById");
        int id = 0;
        instance.deleteUserAccountById(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAccountByTokenId method, of class UserAccountManager.
     */
    @Test
    public void testGetUserAccountByTokenId() {
        System.out.println("getUserAccountByTokenId");
        int tokenId = 0;
        UserAccount expResult = null;
        UserAccount result = instance.getUserAccountByTokenId(tokenId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAccountById method, of class UserAccountManager.
     */
    @Test
    public void testGetUserAccountById() {
        System.out.println("getUserAccountById");
        int Id = 0;
        UserAccount expResult = andrew;
        UserAccount result = instance.getUserAccountById(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAccountsByName method, of class UserAccountManager.
     */
    @Test
    public void testGetUserAccountsByName() {
        System.out.println("getUserAccountsByName");
        String name = "";
        List<UserAccount> expResult = null;
        List<UserAccount> result = instance.getUserAccountsByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deactivateInvalidDiscounts method, of class UserAccountManager.
     */
    @Test
    public void testDeactivateInvalidDiscounts() {
        System.out.println("deactivateInvalidDiscounts");
        UserAccountManager instance = null;
        instance.deactivateInvalidDiscounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deactivateInvalidPasses method, of class UserAccountManager.
     */
    @Test
    public void testDeactivateInvalidPasses() {
        System.out.println("deactivateInvalidPasses");
        UserAccountManager instance = null;
        instance.deactivateInvalidPasses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserAccountManager.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserAccountManager instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
