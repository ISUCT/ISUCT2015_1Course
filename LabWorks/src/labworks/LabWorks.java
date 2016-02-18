/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jskonst
 */
public class LabWorks {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar cal  = Calendar.getInstance();
        //cal.set(2005, 0, 9,0,0);
        cal.set(Calendar.YEAR,2005);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,9);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);
        System.out.println(String.format("C %s", cal.getTime()));
        Date dt = new Date();
        System.out.println(String.format("По %s",dt));       
        long ms = dt.getTime() - cal.getTime().getTime();
        
        System.out.println(ms);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date(ms));
        int numOfYears = cal2.get(Calendar.YEAR)-1970;
        int numOfMonth = cal2.get(Calendar.MONTH);
        int totalDaysCount = (int)Math.ceil(ms/(1000*60*60*24));
        System.out.println(numOfYears);
        System.out.println(numOfMonth);
        System.out.println(totalDaysCount);
        
        
    }
}
