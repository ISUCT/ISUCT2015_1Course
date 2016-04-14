/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banana;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class PlushkaTest {

    public PlushkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
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

    }

    /**
     * Test of y method, of class Plushka.
     */
    @Test
    public void testY() {
        System.out.println("y");
        double x = 4.48;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 1.167;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testY1() {
        System.out.println("y");
        double x = 3.56;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 1.373;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testY2() {
        System.out.println("y");
        double x = 2.78;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 1.526;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testY3() {
        System.out.println("y");
        double x = 5.28;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 0.996;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testY4() {
        System.out.println("y");
        double x = 3.21;
        double b = 0.8;
        double a = 0.4;
        Plushka instance = new Plushka();
        double expResult = 1.447;
        double result = instance.y(x, b, a);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of Duck method, of class Plushka.
     */
    @Test
    public void testDuck() {
        System.out.println("Duck");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(4.48);
        x.add(3.56);
        x.add(2.78);
        x.add(5.28);
        x.add(3.21);
        double a = 0.4;
        double b = 0.8;
        Plushka instance = new Plushka();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.167);
        expResult.add(1.373);
        expResult.add(1.526);
        expResult.add(0.996);
        expResult.add(1.447);
        ArrayList<Double> result = instance.Duck(x, a, b);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }

    }
}
