/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import VIEW.Login;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author HP
 */
public class TransactionsTest {
    Transactions instance;
    
    public TransactionsTest() {
    }
    

    @Before
    public void setUp() {
        instance =Mockito.mock(Transactions.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Signup3.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("testing mthod actionPerformed");
        ActionEvent e =new  ActionEvent(instance, ActionEvent.ACTION_PERFORMED, "command");
        instance.actionPerformed(e);
        Mockito.verify(instance).actionPerformed(e);

    }


    
}
