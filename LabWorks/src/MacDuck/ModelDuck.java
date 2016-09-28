/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MacDuck;

/**
 *
 * @author stud
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flybehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck only");
    }
}
