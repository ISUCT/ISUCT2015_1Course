/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Анютка
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
        int a = 9;
        int b = 2;
        int expResult = 11;
        int result = MyMath.summ(a, b);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testSummMinus(){
        System.out.println("summ with minused");
        int a = -9;
        int b = 2;
        int expResult = -7;
        int result = MyMath.summ(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSummFloat(){
        System.out.println("summ with minused");
        float a = 1.2f;
        float b = 2.1f;
        float expResult = 3.3f;
        float result = MyMath.summ(a, b);
        assertEquals(expResult, result, 0.001);
        
    }
    
    
}

