/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author stud_17
 */
public abstract class Animal {
    String location, boundaries;
    public Animal(String location, String boundaries){
        this.location = location;
        this.boundaries = boundaries;
    }
    public void sleep(){
        System.out.println("I'm sleeping!");
    }
    public void roam(){
        System.out.println("I'm roaming!");
    }
  
}
