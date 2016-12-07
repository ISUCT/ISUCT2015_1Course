/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author stud
 */
public abstract class Duck {

    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack() {
        quackbehavior.quack();
    }

    public void swim() {
        System.out.println("We're all float!!!!!!!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flybehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackbehavior = qb;
    }
}
