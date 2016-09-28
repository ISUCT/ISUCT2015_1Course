/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MacDuck;

/**
 *
 * @author stud
 */
public class RubberDuck extends Duck{
    
     public RubberDuck(){
        quackbehavior = new MuteQuack();
        flybehavior = new FlyNoWay();
    
}
       public void display() {
        System.out.println("I'm rubber duck, I can't fly");
    
}}
