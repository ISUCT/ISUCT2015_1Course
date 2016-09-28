/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;

/**
 *
 * @author stud_6
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    
    }
    @Override
    public void display(){
        System.out.println("Im a red head duck!"); {
    
}
    }
}