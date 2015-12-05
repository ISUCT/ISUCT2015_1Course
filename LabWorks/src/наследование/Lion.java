/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package наследование;

/**
 *
 * @author stud_17
 */
public class Lion extends Animal{
    private Lion[] Lions = new Lion[5];
    private int nextIndex = 0;
    
   // public void add 

    @Override
    public void makeNoise() {
        System.out.println("R-R-R-R");
        System.out.println("Я сплю");
    }
    
    
}
