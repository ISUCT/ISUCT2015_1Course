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
        double expResult = 1.679;
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
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.38);
        expResult.add(0.37);
        expResult.add(0.35);
        expResult.add(0.33);
        expResult.add(0.30);
        ArrayList<Double> result = instance.TaskA(xn, xk, dx, a, b);
        for (int i = 0; i < 0; i++) {
            assertEquals(expResult.get(i), result.get(i), 0.01);

        }
    }

    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.35);
        x.add(1.28);
        x.add(3.51);
        x.add(5.21);
        x.add(4.16);
        double a = 1.2;
        double b = 0.48;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(2.07);
        expResult.add(1.12);
        expResult.add(0.91);
        expResult.add(0.7);
        expResult.add(0.8);
        ArrayList<Double> result = instance.TaskB(x, 1.2, 0.48);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.01);

        }

    }
}
