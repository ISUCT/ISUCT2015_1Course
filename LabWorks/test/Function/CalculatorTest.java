/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_5
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yCalc method, of class Calculator.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double x = 0.0;
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.yCalc(x, a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TaskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.TaskB(x, a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TaskA method, of class Calculator.
     */
    @Test
    public void testTaskA() {
        System.out.println("TaskA");
        double xn = 1.25;
        double xk = 2.75;
        double dx = 0.3;
        double a = 2.0;
        double b = 0.95;
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.TaskA(xn, xk, dx, a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
