/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author stud_6
 */
public class MallardDuck extends Duck {
   public MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = (FlyBehavior) new FlyWithWings();
    }
    @Override
    public void display(){
    System.out.println("I'm a real Mallard duck");
    } 
}
