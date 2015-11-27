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
    int age = (int) (Math.random() * 5 + 1);
    boolean meow;

    public void setAge() {
        int Age = age;
    }
    
    public void voice() {
        if (age < 2) {
            System.out.println("My name is " + name + ", I am " + colour + " coloured cat" + " and I am " + age + " year old");
        } else {
            System.out.println("My name is " + name + ", I am " + colour + " coloured cat" + " and I am " + age + " years old");
        }
    }
    
    public void meow() {
        if (age < 3) {
           System.out.println("Play with me!"); 
        } else {
           System.out.println("Get off!! I am busy!");   
           chaseMouse();
        }
    } 
    
    public void chaseMouse() {
        System.out.println("I am chasing a mouse");
    }
}