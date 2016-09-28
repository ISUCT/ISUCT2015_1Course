/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;
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
public class HomeDuckTest {
    
    public HomeDuckTest() {
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
     * Test of display method, of class HomeDuck.
     */
    
    @Test
    public void testHomeQuack() {
        Duck home = new HomeDuck();
        home.performQuack();
        assertEquals("Quak!\r\n", baos.toString());
    }

    /**
     *
     */
    @Test
    public void testYellowheadDuck() {
        Duck yellowhead = new YellowheadDuck();
        yellowhead.performFly();
        assertEquals("I'm flying!\r\n", baos.toString());
    }

    /**
     *
     */
    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        assertEquals("Quak!\r\n", baos.toString());
    }
}
