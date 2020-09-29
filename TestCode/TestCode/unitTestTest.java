/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class unitTestTest {
    unitTest u;
    
    public unitTestTest() {
    }

    
    @Before
    public void setUp() {
         u=new unitTest();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of signup method, of class unitTest.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        assertEquals(Arrays.asList("Tahiti","14/09/99","tas@gmail.com","Dhaka"), u.signup("Tahiti","14/09/99","tas@gmail.com","Dhaka"));

    }
    
    @Test
    public void testLogin() {
        System.out.println("login passed");
        assertEquals(true,u.login("root", "0000"));
    }

    @Test
    public void testPinChange() {
        System.out.println("PinChange");
                assertEquals("Pin successfully updated.",u.PinChange("0000", "1234"));
    }
    
        @Test
    public void testDeposit() {
        System.out.println("deposit");
        String s=u.deposit(550);
        assertEquals(u.balance+" taka deposited successfully",s);
    }
    
     @Test
    public void testTransactions() {
        double d=110;
        String s=u.Transactions("Withdraw",d);
        assertEquals(d+" taka debited successfully",s);
    }
    
     @Test
    public void testCreatePin() {
        assertEquals("Pin successfully created",u.CreatePin("Malik"));
    }


}
