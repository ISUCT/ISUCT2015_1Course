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
public class Zoo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.animal = "Dog";
        a.name = "Dina";
        a.makeNoise();
        a.isHungry = true;
        a.living();


        Animal b = new Lion();
        b.animal = "Lion";
        b.name = "Sam";
        b.makeNoise();
        b.isHungry = false;
        b.living();
        
        Animal c = new Dog();
        c.animal = "Dog";
        a.name = "Marta";
        a.makeNoise();
        a.isHungry = false;
        a.living();

    }
    
}
