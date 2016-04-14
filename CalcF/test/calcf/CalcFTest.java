/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcf;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class CalcFTest {

    public CalcFTest() {
    }

    /**
     * Test of y method, of class CalcF.
     */
    @Test
    public void testY1() {
        System.out.println("test 1");
        double x = 0.05;
        double b = 1.1;
        double a = 2.0;
        CalcF instance = new CalcF();
        double expResult = 0.836;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    public void testY2() {
        System.out.println("test 2");
        double x = 0.8;
        double b = 1.1;
        double a = 2.0;
        CalcF instance = new CalcF();
        double expResult = 0.395;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    public void testY3() {
        System.out.println("test 3");
        double x = 1.05;
        double b = 1.1;
        double a = 2.0;
        CalcF instance = new CalcF();
        double expResult = 0.395;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of z method, of class CalcF.
     */
    @Test
    public void testZ() {
        System.out.println("z");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.1);
        x.add(0.3);
        x.add(0.4);
        x.add(0.45);
        x.add(0.65);
        double a = 2.0;
        double b = 1.1;
        CalcF instance = new CalcF();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.380);
        expResult.add(0.372);
        expResult.add(0.366);
        expResult.add(0.361);
        expResult.add(0.340);
        ArrayList<Double> result = instance.z(x, a, b);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }
        // TODO review the generated test code and remove the default call to fail.
    }
}
