package calendarik;

import java.util.Calendar;
import java.util.Date;
//import testPackage.MyMath;

public class Calendarik {
    
    public static void main(String[] args) {
        
        Calendar cal  = Calendar.getInstance();
        //cal.set(2005, 0, 9,0,0);
        //cal.set(DAY, MONTH, YEAR);
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
        
        //System.out.println(MyMath.summ(2, 3));
    }
}