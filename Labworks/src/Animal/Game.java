/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Ирина
 */
public class Game {
    public static void main (String[] args) { 
           Animal[] animals = new Animal [3]; 
            
           animals[0] = new Cat (); 
           animals[0].name = "Hutchy"; 
           animals[0].color = "White"; 
            
           animals[1] = new Panther(); 
           animals[1].name = "Jane"; 
           animals[1].color = "Black"; 
            
           animals[2] = new Tiger(); 
           animals[2].name = "Sam"; 
           animals[2].color = "Yellow"; 
            
           for (int i=0; i < animals.length; i++) { 
               animals[i].eat(); 
               animals[i].sleep (); 
               System.out.println(""); 
           } 
        } 
}
