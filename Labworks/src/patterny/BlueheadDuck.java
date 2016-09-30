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
public class BlueheadDuck extends Duck {
    public BlueheadDuck(){
        Squeak QuackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    
    }
    @Override
    public void display(){
        System.out.println("Im a red head duck!"); {
    
}
    }
}
