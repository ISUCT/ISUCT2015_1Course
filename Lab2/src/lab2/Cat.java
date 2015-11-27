/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author anastasia
 */
public class Cat {
   
    String name;
    String colour;
    int age;
    boolean meow;
    
    public void voice() {
        System.out.println("My name is " + name + ", I am " + colour + " coloured cat" + " and I am " + age + " years old");
        }
    
    public void meow() {
        if (meow) {
            System.out.println("Play with me!"); 
        } else { 
            System.out.println("Get off!! I am busy!");
            chaseMouse();
        }
    }    
    
    public void chaseMouse() {
        System.out.println("I am catching a mouse");
    }
    
      
      
} 
