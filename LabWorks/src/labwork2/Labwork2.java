/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork2;

/**
 *
 * @author stud_17
 */
public class Labwork2 {
    String name; 
    
    public void go () {
        Animal[] animals = (new Cat(), new Lion(), new Tiger());
        takeAnimals(animals);
       
    }
    public void takeAnimals(Animal[] animals){
        for (Animal a: animals) {
            a.eat();
            
                  
        }
    }
}
