/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;

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
        double x = 0.0;
        double a = 0.0;
        double b = 1.0;
        Calculator instance = new Calculator();
        double expResult = 3.14115;
        double result = instance.yCalc(x, a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of TakB method, of class Calculator.
     */
    @Test
    public void testTakB() {
        System.out.println("TakB");

        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.08);
        x.add(0.26);
        x.add(0.35);
        x.add(0.41);
        x.add(0.53);

        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.5766);
        expResult.add(1.62);
        expResult.add(1.65);
        expResult.add(1.67);
        expResult.add(1.706);
        ArrayList<Double> result = instance.TakB(x, 2.0, 3.0);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of TaskA method, of class Calculator.
     */
    @Test
    public void testTaskA() {
        System.out.println("TaskA");
        double xn = 0.0;
        double xk = 0.0;
        double dx = 0.0;
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.TaskA(xn, xk, dx, a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
