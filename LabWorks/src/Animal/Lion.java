/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author stud_17
 */
public class Lion extends Feline{
        @Override
        public void eat(){
    System.out.println(hashCode() + " is eating"); }
        
    public void voice(){
        System.out.println("roar");
    }
}
