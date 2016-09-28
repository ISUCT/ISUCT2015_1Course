/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;

/**
 *
 * @author stud_6
 */
public class HomeDuck extends Duck {
    public HomeDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }
    @Override
    public void display(){
        System.out.println("I'm a Home duck!");
    }
    
}
