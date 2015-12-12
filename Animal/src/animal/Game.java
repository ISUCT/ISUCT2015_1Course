/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Надежда
 */
public class Game {
        public static void main (String[] args) {
        Animal[] animals = new Animal [3];
        
        animals[0] = new Tiger ();
        animals[0].name = "Soe";
        animals[0].color = "Red";
        
        animals[1] = new Dog();
        animals[1].name = "Ed";
        animals[1].color = "Write";
        
        animals[2] = new Mouse();
        animals[2].name = "Jo";
        animals[2].color = "Grey";
        
        for (int i=0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep ();
            System.out.println("");
        }
    }
}


