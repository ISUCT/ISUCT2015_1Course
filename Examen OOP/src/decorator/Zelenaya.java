/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author stud_17
 */
public class Zelenaya  extends CondimentDecorator {
    
    Ykrashenie ykrashenie;
    
    public Zelenaya(Ykrashenie ykrashenie) {
          this.ykrashenie = ykrashenie;
    }

    @Override
    public String getDescription() {
        return ykrashenie.getDescription() + ", Zelenaya";
    }
    
}
