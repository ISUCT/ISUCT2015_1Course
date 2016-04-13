/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banana;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
 */
public class PlushkaTest {
    
    public PlushkaTest() {
    }

    /**
     * Test of main method, of class Plushka.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Plushka.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of y method, of class Plushka.
     */
    @Test
    public void testY() {
        System.out.println("y");
        double x = 4.8;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 1.097;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
