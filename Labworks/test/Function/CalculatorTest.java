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
 * @author stud_5
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
    }

    /**
     * Test of z method, of class Calculator.
     */
    @Test
    public void testZ() {
        System.out.println("z");
        ArrayList<Double> x = null;
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.z(x, a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of d method, of class Calculator.
     */
    @Test
    public void testD() {
        System.out.println("d");
        double xn = 0.0;
        double xk = 0.0;
        double dx = 0.0;
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.d(xn, xk, dx, a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
