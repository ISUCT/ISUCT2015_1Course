/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Akira
 */
public class Animal {    
    Boolean lazy;
    String name;
    String animal;

    public void voice() {
System.out.println ("Welcome to the Zoo! Nice to see you"); 
        System.out.println(animal + " shout:");
        System.out.println("My name is " + name);        
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void deepSleep() {
        System.out.println(name + " is sleeping so deep, you can't even see him");
    }

    public void sleeping() {
        if (lazy) {
            deepSleep();
        } else {
            sleep();
        }
    }

}
    

