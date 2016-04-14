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
    public void testSumm() {
        System.out.println("summ");
        int a = 1;
        int b = 2;
        int expResult = 3;
        int result = MyMath.summ(a, b);
        assertEquals(expResult, result);
      
    }
    public void testSummFloat() {
        System.out.println("FloatSumm");
        int a = 1.1f;
        int b = 2.2f;
        int expResult = 3;
        int result = MyMath.FloatSumm(a, b);
        assertEquals(expResult, result);
      
}
