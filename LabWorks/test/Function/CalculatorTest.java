/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    /**
     * Test of yCalc method, of class Calculator.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double x = 1.88;
        double a = 0.8;
        double b = 0.4;
        Calculator instance = new Calculator();
        double expResult = 62.6132;
        double result = instance.yCalc(x, a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of z method, of class Calculator.
     */
    @Test
    public void testZ() {
        System.out.println("z");
        double x = 2.0;
        double a = 0.8;
        double b = 0.4;
        Calculator instance = new Calculator();
        double result = instance.yCalc(x, a, b);
        double expResult = 80.626;
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
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

    }

    /**
     * Test of b method, of class Calculator.
     */
    @Test
    public void testB() {
        System.out.println("b");
        double xn = 1.23;
        double xk = 7.23;
        double dx = 1.2;
        double a = 0.8;
        double b = 0.4;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(12.506);
        expResult.add(182.523);
        expResult.add(1063.98);
        expResult.add(3913.987);
        expResult.add(10992.446);
        ArrayList<Double> result = instance.b(xn, xk, dx, a, b);
        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
            // TODO review the generated test code and remove the default call to fail.
        }
    }
}

