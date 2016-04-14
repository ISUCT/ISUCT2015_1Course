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
        double x = 1.25;
        double a = 1.35;
        double b = 0.98;
        Calculator instance = new Calculator();
        double expResult = 5.159;
        double result = instance.yCalc(x, a, b);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of TaskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.35);
        x.add(1.28);
        x.add(3.51);
        x.add(5.21);
        x.add(4.16);
        double a = 1.35;
        double b = 0.98;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(-1.09);
        expResult.add(4.66);
        expResult.add(0.91);
        expResult.add(0.7);
        expResult.add(0.8);
        ArrayList <Double> result = instance.TaskB(x, 1.35 , 0.98);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.01);
        }
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    }
