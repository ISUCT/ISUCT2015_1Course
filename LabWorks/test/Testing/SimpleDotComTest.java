/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

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
public class SimpleDotComTest {
    
    public SimpleDotComTest() {
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
     * Test of setLocationCells method, of class SimpleDotCom.
     */
    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        int[] locs = null;
        SimpleDotCom instance = new SimpleDotCom();
        instance.setLocationCells(locs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkYourself method, of class SimpleDotCom.
     */
    @Test
    public void testCheckYourself() {
        System.out.println("checkYourself");
        String stringGuess = "";
        SimpleDotCom instance = new SimpleDotCom();
        String expResult = "";
        String result = instance.checkYourself(stringGuess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
