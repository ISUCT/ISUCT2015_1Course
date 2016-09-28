/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author stud_6
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = (FlyBehavior) new FlyWithWings();
    
    }
    public void display(){
        System.out.println("Im a red head duck!");
   }
    
}
