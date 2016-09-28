/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

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
public class DotComTest {
    
    public DotComTest() {
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
     * Test of setLocationCells method, of class DotCom.
     */
    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        ArrayList<String> loc = null;
        DotCom instance = new DotCom();
        instance.setLocationCells(loc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class DotCom.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        DotCom instance = new DotCom();
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkYourself method, of class DotCom.
     */
    @Test
    public void testCheckYourself() {
        System.out.println("checkYourself");
        String userInput = "";
        DotCom instance = new DotCom();
        String expResult = "";
        String result = instance.checkYourself(userInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
