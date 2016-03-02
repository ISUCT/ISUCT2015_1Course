/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
 */
public class TesterTest {
    
    public TesterTest() {
    }

    /**
     * Test of summ method, of class Tester.
     */
    @Test
    public void testSumm() {
        System.out.println("summ");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Tester.summ(a, b);
        assertEquals(expResult, result);
    }
    
}
