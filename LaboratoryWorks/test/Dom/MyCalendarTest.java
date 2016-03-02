/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dom;

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
     * Test of diff method, of class MyCalendar.
     */
    @Test
    public void testDiff() {
        System.out.println("diff");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2005);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,9);
        Date first = cal.getTime();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015, 4 , 12);
        Date second = cal.getTime();
        MyCalendar instance = new MyCalendar();
        cal2.set(10, 2 ,3);
        Date expResult =cal2.getTime();
        Date result = instance.diff(first, second);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class MyCalendar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyCalendar.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
