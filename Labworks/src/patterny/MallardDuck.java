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
public class MallardDuck extends Duck {
    public MallardDuck(){
        Quack Quackbehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("I'm a Mallard duck!");
        
    }
    
}