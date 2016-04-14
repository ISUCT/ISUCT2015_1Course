/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

/**
 *
 * @author stud_17
 */
public class Calendar {
    Calendar cal = Calendar.getInstanse();
    cal.set(2016, 2, 17);
    long ms = cal.getTime().getTime();
    System.out.println(ms );
    
    
}
