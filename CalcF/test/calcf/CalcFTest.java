/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcf;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
 */
public class CalcFTest {
    
    public CalcFTest() {
    }

    /**
     * Test of main method, of class CalcF.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalcF.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of y method, of class CalcF.
     */
    @Test
    public void testY() {
        System.out.println("y");
        double x = 0.8;
        double b = 1.1;
        double a = 2.0;
        CalcF instance = new CalcF();
        double expResult = 0.395;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
