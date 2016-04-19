/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
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
        double x = 0.55;
        double a = 1.2;
        double b = 0.48;
        Calculator instance = new Calculator();
        double expResult = 1.100;
        double result = instance.yCalc(x, a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
