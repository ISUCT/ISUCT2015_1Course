/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
public class MyMathTest {
    
    public MyMathTest() {
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
     * Test of summ method, of class MyMath.
     */
    @Test
    public void testSummFloat() {
        System.out.println("summ");
        float a = 2.5f;
        float b = 3.1f;
        float expResult = 5.6f;
        float result = MyMath.summ(a, b);
        assertEquals(expResult, result);
        
    }
}
