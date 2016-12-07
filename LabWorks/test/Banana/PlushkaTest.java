
package Banana;

import clien_server_calc.Plushka;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;


public class PlushkaTest {

    public PlushkaTest() {
    }



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

    }

    
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

    /**
     * Test of Pachka method, of class Plushka.
     */
    @Test
    public void testPachka() {
        System.out.println("Pachka");
        double xn = 3.2;
        double xk = 6.2;
        double dx = 0.6;
        double a = 0.4;
        double b = 0.8;
        Plushka instance = new Plushka();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.449);
        expResult.add(1.320);
        expResult.add(1.185);
        expResult.add(1.054);
        expResult.add(0.932);
        expResult.add(0.821);
        ArrayList<Double> result = instance.Pachka(xn, xk, dx, a, b);
           for (int i = 0; i < result.size(); i++) {
         assertEquals(expResult.get(i), result.get(i), 0.001);
    }
}}
