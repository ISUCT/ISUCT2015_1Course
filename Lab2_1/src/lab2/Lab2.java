package lab2;

import java.util.*;

public class Lab2 {
    String name;
    
    public void go() {
        Animal[] animals = {new Fish(), new Cat(), new Dog(), new Chaosic()};
        takeAnimals(animals);
    }
    
    public void takeAnimals(Animal[] animals) {
        for (Animal c : animals) {
            c.eat();
            c.voice();
        }
    }
    
    public static void main(String[] args) {     
        Animal[] animal = new Animal[5];
        Animal cat = new Cat();
        cat.name = "cat";
        cat.voice();
        cat.setName();
     
        Animal fish = new Fish();
        fish.name = "fish";
        fish.voice();
        fish.eat();
        fish.setName();      
    }
}
