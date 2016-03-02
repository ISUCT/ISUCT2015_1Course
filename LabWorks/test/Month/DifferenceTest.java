/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Month;

import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UI
 */
public class DifferenceTest {
    
    public DifferenceTest() {
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
     * Test of main method, of class Difference.
     */


    /**
     * Test of diff method, of class Difference.
     */
    @Test
    public void testDiff() {
        System.out.println("diff");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2015);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,9);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        Date first = c.getTime();
        
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.YEAR,2016);
        c2.set(Calendar.MONTH,3);
        c2.set(Calendar.DAY_OF_MONTH,9);
        c2.set(Calendar.HOUR_OF_DAY,2);
        c2.set(Calendar.MINUTE,1);
        c2.set(Calendar.SECOND,5);
        c2.set(Calendar.MILLISECOND,3);
        Date second = c2.getTime();
        
        Difference instance = new Difference();
        Date expResult = c2.getTime();
        Date result = instance.diff(first, second);
        assertEquals(expResult, result);
       
       
    }
    
}
