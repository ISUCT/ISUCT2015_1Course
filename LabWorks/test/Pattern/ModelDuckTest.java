/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_6
 */
public class ModelDuckTest {
    
    public ModelDuckTest() {
    }
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(ps);
    }
    
    @After
    public void tearDown() {
        baos.reset();
    }

    /**
     * Test of display method, of class ModelDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        ModelDuck instance = new ModelDuck();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
