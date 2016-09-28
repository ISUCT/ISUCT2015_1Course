/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;

/**
 *
 * @author stud_6
 */
public class Patter {
    public static void main (String[] args){
        Duck mallard = new HomeDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performQuack();
        model.setQuackBehavior (new MuteQuack());
        model.performQuack();
    }
    
}
