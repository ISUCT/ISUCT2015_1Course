/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package наследование;

/**
 *
 * @author stud_17
 */
public class Game {
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        a.makeNoise();
        Animal f = new Lion();
        f.sleep();
        f.makeNoise();
        
    
}
}