package datecal;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateCalTest {
    
    public DateCalTest() {
    }

    /**
     * Test of main method, of class DateCal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DateCal.main(args);
    }

    /**
     * Test of diff method, of class DateCal.
     */
    @Test
    public void testDiff() {
        System.out.println("diff №1");
       
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
        
       
        DateCal instance = new DateCal();
        Date expResult = c.getTime(); c2.getTime();
        Date result = instance.diff(first, second);
        assertEquals(expResult, result); 
        System.out.println(result);
    }  
}