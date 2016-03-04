package getdate;

import java.util.Calendar;
import java.io.*;
import javax.swing.JOptionPane;

public class GetDate {
    
    public static void main(String[] args) {
        
        
        Calendar c = Calendar.getInstance();
                       
        int tMon = c.get(Calendar.MONTH);
        int tDay = c.get(Calendar.DATE);
        int tYr = c.get(Calendar.YEAR);
        
        System.out.println("Today is: " + tMon + " " + tDay + " " + tYr);
        
        int myMon;
        int myDay;
        int myYr;
        int days;
        
        String Mon = JOptionPane.showInputDialog ("Write the month, sir") ;
                
        myMon = Integer.parseInt(Mon);
        
        String Day = JOptionPane.showInputDialog ("Write the day, sir") ;         
        myDay = Integer.parseInt(Day);
        
        String Year = JOptionPane.showInputDialog ("Write the year, sir") ;         
        myYr = Integer.parseInt(Year);
        
        Calendar myBirthday = Calendar.getInstance();
        myBirthday.set(myMon, myDay, myYr);
            
        if(myDay > tDay){
            days = myDay-tDay;
        } else{
            days = tDay-myDay;
        } 
        
        
            
        System.out.println("It's been: " + (tMon - myMon) + " moths " + days + " days" + (tYr - myYr) + " years since I was born");    
        
    }    
}