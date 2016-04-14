/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author stud_17
 */
public class Igryshki extends Ykrashenie {
    public Igryshki() {
        description = "Igryshki samie raznie";
    }
    
    @Override
    public String getDescription() {
    return description;
            }
    
}
