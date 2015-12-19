/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author stud_17
 */
public class Game {
    
    public static void main(String[] args){
    Animal a = new Lion();
    a.name = "Lolly";
    a.eat();
    a.comeHome();
    a.sleep();
    a.voice();
    
    Animal b = new Rabbit();
    b.name = "Yan";
    b.eat();
    b.roam();
    b.sleep();
    b.voice();
    }
}
