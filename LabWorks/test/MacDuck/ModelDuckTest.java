/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MacDuck;

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
 * @author stud
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
    public void testMallardQuack() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Quack!\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
       
    }
   @Test
    public void testRubberDuck() {
        Duck readhead = new RubberDuck();
        readhead.performFly();
        assertEquals("I can't fly, sorry\r\n", baos.toString());
    }
   
       @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        assertEquals("Quack!\r\n", baos.toString());
    }
}

