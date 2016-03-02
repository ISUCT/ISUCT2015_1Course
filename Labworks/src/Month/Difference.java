/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Month;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author stud_17
 */
public class Difference {
    
    public static void main(String[] args) {
        
        Calendar c  = Calendar.getInstance();
        //cal.set(2005, 0, 9,0,0);
        c.set(Calendar.YEAR,2005);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,9);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        
        System.out.println(String.format("C %s", c.getTime()));
        Date dt = new Date();
        System.out.println(String.format("По %s",dt));       
        long ms = dt.getTime() - c.getTime().getTime();
        
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
    public Date diff(Date first, Date second){
        return new Date (second.getTime() - first.getTime());
      
    }
}
