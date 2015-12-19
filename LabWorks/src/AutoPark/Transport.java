/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoPark;

/**
 *
 * @author stud_17
 */
public class Transport {
    Boolean isEmpty;
    String brand;
    String transport;
    
    public void sound() {
 System.out.println("Welcome to the autopark!");
           System.out.println(transport + " sound:");
           System.out.println("My brand is" + brand);
    
       
    }
    public void start() {
        System.out.println(brand + "is starting");
        
    }
    public void ride() {
        System.out.println(transport + "is riding");
    }
    public void stay() {
        System.out.println(transport + "is staying");
    }
    public void action() {
        if (isEmpty) {
            stay();
        } else {
            ride();
        }
    }
    
}
