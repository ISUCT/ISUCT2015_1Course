/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Month;

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
public class MyManthTest {
    
    public MyManthTest() {
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
        System.out.println("summ");
        int a = 3;
        int b = 2;
        int expResult = 5;
        int result = MyManth.summ(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
