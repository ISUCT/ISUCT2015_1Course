/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package наследование;

/**
 *
 * @author stud_17
 */
public class Dog extends Animal{
    private Dog[] Dogs = new Dog[5];
    private int nextIndex = 0;

    @Override
    public void makeNoise() {
        System.out.println("Gav");
        System.out.println("Я сплю");
    }
    
    
}
