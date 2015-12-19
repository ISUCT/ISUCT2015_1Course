/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipmentpark;

/**
 *
 * @author stud_17
 */
public class Equipment {
    

Boolean  isDeenergized;
    String brand;
    String equipment;
    
    public void sound() {
 System.out.println("Welcome to the equipmentpark!");
           System.out.println(equipment + " sound:");
           System.out.println("My brand is" + brand);
    
       
    }
    public void switchon() {
        System.out.println(brand + "switch on");
        
    }
    public void switchoff() {
        System.out.println(brand + "switch off");
    }
  
    
    public void action() {
        if (isDeenergized) {
            switchoff();
        } else {
            switchon();
        }
    }
    
}