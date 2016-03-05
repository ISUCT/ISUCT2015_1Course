/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author UI
 */
public class TesterTest {
    
    public TesterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of summ method, of class Tester.
     */
    @Test
    public void testSumm() {
        System.out.println("summ test 1");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Tester.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    @Test
    public void test2Summ() {
        System.out.println("summ test 2");
        int a = 1;
        int b = 12;
        int expResult = 13;
        int result = Tester.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    @Test
    public void test3Summ() {
        System.out.println("summ test 3");
        int a = 5;
        int b = 10;
        int expResult = 15;
        int result = Tester.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    @Test
    public void test4Summ() {
        System.out.println("summ test 4");
        int a = -12;
        int b = 10;
        int expResult = -2;
        int result = Tester.summ(a, b);
        assertEquals(expResult, result);
        System.out.println(result);
    }
}
