package Graph;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Graph.Calculator;
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
     * Test of y method, of class CalcF.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double x = 1.1;
        double b = 0.48;
        double a = 1.2;
        Calculator instance = new Calculator();
        double expResult = 0.836;
        double result = instance.yCalc(x, b, a);
        assertEquals(expResult, result, 0.001);
    }

    public void testYCalc2() {
        System.out.println("yCalc");
        double x = 1.2;
        double b = 0.48;
        double a = 1.2;
        Calculator instance = new Calculator();
        double expResult = 0.395;
        double result = instance.yCalc(x, b, a);
        assertEquals(expResult, result, 0.001);
    }

    public void testYCalc3() {
        System.out.println("yCalc");
        double x = 1.3;
        double b = 0.48;
        double a = 1.2;
        Calculator instance = new Calculator();
        double expResult = 0.395;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of z method, of class CalcF.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.25);
        x.add(0.36);
        x.add(0.56);
        x.add(0.94);
        x.add(1.28);
        double a = 1.2;
        double b = 0.48;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.380);
        expResult.add(0.372);
        expResult.add(0.366);
        expResult.add(0.361);
        expResult.add(0.340);
        ArrayList<Double> result = instance.TaskB(x, a, b);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }
     }

    /**
     * Test of f method, of class CalcF.
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
        expResult.add(0.380);
        expResult.add(0.372);
        expResult.add(0.366);
        expResult.add(0.361);
        expResult.add(0.340);
        ArrayList<Double> result = instance.f(xn, xk, dx, a, b);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }
    }
}
