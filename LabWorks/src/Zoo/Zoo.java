/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;
import java.util.Arrays;

/**
 *
 * @author Elya
 */
public class Zoo {
    public static void main(String[] args) {
    Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].isHungry = true;
        animals[0].name = "John";
        
        animals[1] = new Cat();
        animals[1].isHungry = true;
        
        animals[2] = new Lion();
        animals[2].isHungry = false;
        
        
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
            animals[i].living();
            System.out.println("");       
        } 
    }
}
    

