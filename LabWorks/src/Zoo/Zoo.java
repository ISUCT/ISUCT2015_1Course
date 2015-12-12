/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author stud_17
 */
public class Zoo {
     public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].isHungry = true;
        animals[0].name = "Sharik";
        
        animals[1] = new Cat();
        animals[1].isHungry = false;
        
        animals[2] = new Lion();
        animals[2].isHungry = false;
        
        
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
            animals[i].living();
            System.out.println("");       
        }  
    }
}


