package outworld;

import java.util.Arrays;

public class OutWorld {
   

    public static void main(String[] args) {

        
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].isHungry = true;
        
        animals[1] = new Chaosic();
        animals[1].isHungry = false;
        
        animals[2] = new Penguin();
        animals[2].isHungry = false;
        
        
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].voice();
            animals[i].living();
            System.out.println("");       
        }
        
        
    }
}
