/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jskonst
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
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = MyMath.summ(a, b);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void testSummMinus() {
        System.out.println("summ with minused");
        int a = -2;
        int b = 3;
        int expResult = 1;
        int result = MyMath.summ(a, b);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void testSummFloat() {
        System.out.println("summ with minused");
        float a = 2.5f;
        float b = 3.1f;
        float expResult = 5.6f;
        float result = MyMath.summ(a, b);
        assertEquals(expResult, result,0.001); 
    }
    
}
