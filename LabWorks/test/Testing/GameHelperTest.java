/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import dotcom.GameHelper;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud
 */
public class GameHelperTest {
    
    public GameHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getUserInput method, of class GameHelper.
     */
    @Test
    public void testGetUserInput() {
        System.out.println("getUserInput");
        String prompt = "";
        GameHelper instance = new GameHelper();
        String expResult = "";
        String result = instance.getUserInput(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeDotCom method, of class GameHelper.
     */
    @Test
    public void testPlaceDotCom() {
        System.out.println("placeDotCom");
        int comSize = 0;
        GameHelper instance = new GameHelper();
        ArrayList expResult = null;
        ArrayList result = instance.placeDotCom(comSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
