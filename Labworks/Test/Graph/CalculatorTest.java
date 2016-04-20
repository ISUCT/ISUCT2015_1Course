/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

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

    @Test
    public void testSomeMethod() {
        
         Calculator t = new Calculator();
    }

    /**
     * Test of yCalc method, of class Calculator.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double x = 1.1;
        double b = 0.48;
        double a = 1.2;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.yCalc(x, b, a);
        assertEquals(expResult, result, 0.001);
       
       
    }

    /**
     * Test of TaskA method, of class Calculator.
     */
    @Test
    public void testTaskA() {
        System.out.println("TaskA");
        double xn = 0.7;
        double xk = 2.2;
        double dx = 0.3;
        double a = 1.2;
        double b = 0.48;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = instance.TaskA(xn, xk, dx, a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of TaskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = null;
        double a = 1.2;
        double b = 0.48;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = instance.TaskB(x, a, b);
        assertEquals(expResult, result);
       
    }
}
