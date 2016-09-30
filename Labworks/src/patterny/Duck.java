/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;

/**
 *
 * @author UI
 */
public abstract class Duck {
        FlyBehavior flyBehavior;
    Quackbehavior Quackbehavior;
    
    
    public Duck(){
        
    }
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
        
    }
    public void performQuack(){
        Quackbehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float and quack!");
    }
    public void setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
}
    public void setQuackBehavior(Quackbehavior qb){
        quackBehavior = qb;
    }
}
