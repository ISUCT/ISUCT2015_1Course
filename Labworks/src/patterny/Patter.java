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
public class Patter {
    
    public static void main (String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
       
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior((FlyBehavior) new FlyrocketPowered());
    model.performFly();
}
}
