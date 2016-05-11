/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
 */
public class TasksClassTest {
    
    public TasksClassTest() {
    }

    /**
     * Test of yCalc method, of class TasksClass.
     */
    @Test
    public void testYCalc() {
        System.out.println("yCalc");
        double x = 0.0;
        TasksClass instance = new TasksClass();
        double expResult = 1.57;
        double result = instance.yCalc(x);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of TaskB method, of class TasksClass.
     */
    @Test
    public void testTaskB() {
        System.out.println("TaskB");
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(0.1);
        x.add(0.9);
        x.add(1.2);
        x.add(1.5);
        x.add(2.3);
        TasksClass instance = new TasksClass();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.470);
        expResult.add(0.451);
        expResult.add(0.0);
        expResult.add(-0.312);
        expResult.add(-1.196);
        ArrayList<Double> result = instance.TaskB(x);
         for (int i = 0; i < result.size(); i++) {
        assertEquals(expResult.get(i), result.get(i), 0.001);
    }
    }
    /**
     * Test of TaskA method, of class TasksClass.
     */
    @Test
    public void testTaskA() {
        System.out.println("TaskA");
        double xn = 0.2;
        double xk = 2.2;
        double dx = 0.4;
        TasksClass instance = new TasksClass();
        ArrayList<Double> expResult = new ArrayList<Double>();
        ArrayList<Double> result = instance.TaskA(xn, xk, dx);
        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i), result.get(i), 0.001);
        }
    
    }
}
