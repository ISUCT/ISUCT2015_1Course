/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author stud
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackbehavior = new Quack();
        flybehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm real Mallard Duck!");
    }
}
