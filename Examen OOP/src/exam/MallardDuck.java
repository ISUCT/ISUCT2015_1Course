/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import exam.Duck.Fly;
import exam.Duck.Fly.Quack;

/**
 *
 * @author stud_17
 */
public class MallardDuck extends Duck implements Fly,Quack{

    /**
     *
     */
    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void FlyBehavior() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void QuackBehavior() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
