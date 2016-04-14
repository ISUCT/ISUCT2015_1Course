/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author anastasia
 */
public class Lab2 {
    String name;
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Milly";
        cat1.colour = "white";
        cat1.voice();
        cat1.meow();
        cat1.setAge();
    
//    ..................    
        
    Cat[] cats = new Cat[3];      
    
        cats[0] = new Cat();
        cats[0].name = "Effy";
        cats[0].colour = "orange";
        cats[0].meow = true;
            
        
        cats[1] = new Cat();
        cats[1].name = "Samhein";
        cats[1].colour = "black";
        cats[1].meow = false;
            

        cats[2] = new Cat();
        cats[2].name = "Brinje";
        cats[2].colour = "peach";
        cats[2].meow = true;
            
            
    int i = 0; 
        while(i < cats.length){
            cats[i].voice();
            cats[i].meow();
            cats[i].setAge();
            i=i+1;
        }
    }
    
}
