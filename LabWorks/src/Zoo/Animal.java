/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author stud_17
 */
public abstract class Animal {
    Boolean isHungry;
    String name;
    String animal;
    
    public void makeNoise () {
        System.out.println(getClass() + " shout:");
        System.out.println("'I am the " + hashCode() + "'");        
    }

    public void eat() {
        System.out.println(hashCode() + " is eating");
    }

    public void sleep () {
        System.out.println(name + "sleep" );
        
    }

    public void roam() {
        System.out.println(name + "seek the food") ;
    }
    
   public void living() {
       if (isHungry){
           eat();
            
       } else {
           roam();
       }
   }
}


