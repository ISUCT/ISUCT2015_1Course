/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author stud_17
 */
public class Cat extends Animal {
    public Cat(String location, String boundaries){
        super(location,boundaries);
    }
    @Override
    public void sleep(){
        System.out.println("I'm cat!I'm sleeping!");
    }
    @Override
    public void roam(){
        System.out.println("I'm cat!I'm roaming!");
    }
    
}
