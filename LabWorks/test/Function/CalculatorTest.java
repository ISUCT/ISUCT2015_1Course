/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

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
}
