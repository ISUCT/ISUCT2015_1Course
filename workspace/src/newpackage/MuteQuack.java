/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author stud_6
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}