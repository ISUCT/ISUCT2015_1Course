/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Elya
 */
public class Animal {
    Boolean isHungry;
    String name;
    String animal;
    
    public void eat(){
        System.out.println(name + "is eating");
    }
    
    public void makeNoise (){
System.out.println(animal + "voice:");
System.out.println("'I am an animal'");
}
public void sleep (){
System.out.println(name + "sleep");
}
public void roam(){
System.out.println(name +"seek the food" );
}
public void living(){
if (isHungry){
eat();
} else {
roam();
}
}
}