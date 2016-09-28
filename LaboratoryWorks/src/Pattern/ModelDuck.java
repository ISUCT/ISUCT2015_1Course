/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author stud_6
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
    }
    @Override
    public void display() {
    System.out.println("I'm a model duck!");
    }
    
}
