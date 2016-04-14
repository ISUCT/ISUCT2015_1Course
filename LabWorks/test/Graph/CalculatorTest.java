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
        double x = 2.25;
        Calculator instance = new Calculator();
        double expResult = 2.154;
        double result = instance.yCalc(x);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testYCalc2() {
        System.out.println("yCalc");
        double x = 3.24;
        Calculator instance = new Calculator();
        double expResult = 2.688;
        double result = instance.yCalc(x);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of TaskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(1.84);
        x.add(2.71);
        x.add(3.81);
        x.add(4.56);
        x.add(5.62);
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.78);
        expResult.add(2.436);
        expResult.add(2.913);
        expResult.add(3.164);
        expResult.add(3.466);
        ArrayList<Double> result = instance.TaskB(x);
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
        double xn = 1.25;
        double xk = 3.25;
        double dx = 0.4;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.562);
        expResult.add(1.444);
        expResult.add(1.996);
        expResult.add(2.287);
        expResult.add(2.508);
        ArrayList<Double> result = instance.TaskA(xn, xk, dx);
        for (int i = 0; i < 5; i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    }
}