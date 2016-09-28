/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterny;

/**
 *
 * @author stud_6
 */
public class YellowheadDuck extends Duck{
    public YellowheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("I'm read head duck, hello!");{
    }
    }
}
