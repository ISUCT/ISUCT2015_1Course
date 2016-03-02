/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

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
public class MyCalendarTest {
    
    public MyCalendarTest() {
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
     * Test of main method, of class MyCalendar.
     */

  

    /**
     * Test of diff method, of class MyCalendar.
     */
    @Test
    public void testDiff() {
        System.out.println("diff");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2005);
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DAY_OF_MONTH, 9);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date first = cal.getTime();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2005, 2, 8, 0, 0, 0);
        Date second = cal2.getTime() ;
        MyCalendar instance = new MyCalendar();
        cal.set(1969, 10, 31, 4, 0, 0);
        Date expResult = cal.getTime();
        Date result = instance.diff(first, second);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
