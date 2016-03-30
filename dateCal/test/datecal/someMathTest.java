/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Анастасия
 */
public class someMathTest {

    public someMathTest() {
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
     * Test of summ method, of class MyManth.
     */
    @Test
    public void testSumm() {
        System.out.println("summ test №1");
        int a = 5;
        int b = 0;
        int expResult = 5;
        int result = someMath.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
    @Test
    public void test2Summ() {
        System.out.println("summ test №2");
        int a = -5;
        int b = 9;
        int expResult = 4;
        int result = someMath.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
    @Test
    public void test3Summ() {
        System.out.println("summ test №3");
        int a = -6;
        int b = -7;
        int expResult = -13;
        int result = someMath.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
        
    }
    
    @Test
    public void test4Summ() {
        System.out.println("summ test №4");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = someMath.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
        
    }
    
    @Test
    public void test5Summ() {
        System.out.println("summ test №5");
        float a = 2.5f;
        float b = 3.1f;
        float expResult = 5.6f;
        float result = someMath.summ(a, b);
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
    }
}