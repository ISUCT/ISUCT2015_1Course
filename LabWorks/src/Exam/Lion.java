/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author stud_17
 */
public class Lion extends Animal {
    public Lion(String location, String boundaries){
        super(location,boundaries);
    }
    
    @Override
    public void sleep(){
        System.out.println("I'm lion!I'm sleeping!");
    }
    @Override
    public void roam(){
        super.roam();
        System.out.println("I'm lion!I'm roaming!");
    }
    
}
