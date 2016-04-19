/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ирина
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
        double x = 0.2;
        double a = 0.05;
        double b = 0.06;
        Calculator instance = new Calculator();
        double expResult = 40.907;
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
        ArrayList<Double> n = new ArrayList<Double>();
        n.add(0.15);
        n.add(0.26);
        n.add(0.37);
        n.add(0.48);
        n.add(0.56);
        double a = 0.05;
        double b = 0.06;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(77.59);
        expResult.add(23.129);
        expResult.add(10.66);
        expResult.add(5.836);
        expResult.add(3.969);
        ArrayList<Double> result = instance.z(n, a, b);
        for (int i = 0; i < result.size(); i++) {
        assertEquals(expResult.get(i), result.get(i), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    }
    /**
     * Test of d method, of class Calculator.
     */
    @Test
    public void testD() {
        System.out.println("d");
        double xn = 0.2;
        double xk = 0.95;
        double dx = 0.15;
        double a = 0.05;
        double b = 0.06;
        Calculator instance = new Calculator();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(40.907);
        expResult.add(12.067);
        expResult.add(5.285);
        expResult.add(2.626);
        expResult.add(1.274);
        ArrayList<Double> result = instance.d(xn, xk, dx, a, b);
        for (int i = 0; i < result.size(); i++){
        assertEquals(expResult.get(i), result.get(i), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
}