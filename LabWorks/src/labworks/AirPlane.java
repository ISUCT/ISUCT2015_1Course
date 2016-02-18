/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jskonst
 */
public class AirPlane {

    private int speed;
    private String name;

    public AirPlane(){
        this("Plane",20);
    }
    
    public AirPlane(String aName, int aFuelLevel){
        this.fuelLevel = aFuelLevel;
        this.name = aName;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    
    private int fuelLevel;
    private boolean isFlying;
    
    @Override
    public String toString() {
        Date a = new Date();
        
        return String.format("Борт %s с %s тоннами топлива", name, fuelLevel);
        
        
                //"Борт " + name + " с " + fuelLevel+ " тоннами топлива";
    }

    public void fly() {
        isFlying = true;
    }

    public void land() {
        isFlying = false;
    }
    
    
    //issue
}
