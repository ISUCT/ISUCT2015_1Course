/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author stud_17
 */
public abstract class Duck {

    /**
     *
     */
    public void swim() {
    }

    public abstract void display();

    public interface Fly {

        /**
         *
         */
        public abstract void FlyBehavior();

        public interface Quack {

            public void QuackBehavior();
        }
    }
}
