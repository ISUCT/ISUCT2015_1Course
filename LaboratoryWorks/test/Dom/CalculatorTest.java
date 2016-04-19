/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dom;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
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
     * Test of yCalc method, of class Calculator.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double a = 1.0;
        double x = 2.0;
        Calculator instance = new Calculator();
        double expResult = 1.5228;
        double result = instance.yCalc(a, x);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of TakB method, of class Calculator.
     */
    @Test
    public void testTakB() {
        System.out.println("TakB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(1.28);
        x.add(1.36);
        x.add(2.47);
        x.add(3.68);
        x.add(4.56);
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(2.27);
        expResult.add(2.42);
        expResult.add(4.90);
        expResult.add(8.44);
        expResult.add(11.47);
        ArrayList<Double> result = instance.TakB(x, 1.6);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.01);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
    }

    /**
     * Test of TakA method, of class Calculator.
     */
    @Test
    public void testTakA() {
        System.out.println("TakA");
        double xn = 1.2;
        double xk = 3.7;
        double dx = 0.5;
        double a = 1.6;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(2.135);
        expResult.add(3.095);
        expResult.add(4.228);
        expResult.add(5.515);
        expResult.add(6.944);
        ArrayList<Double> result = instance.TakA(xn, xk, dx, a);
        for (int i = 0; i < result.size(); i++){
        assertEquals(expResult.get(i), result.get(i), 0.001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        }
    }
}
