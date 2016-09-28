/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patteny;

/**
 *
 * @author stud_6
 */
public class Patter {
    
    public static void main (String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
       
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
}
}