/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author jskonst
 */
public class AirPlane {

    int speed;
    String name;
    int fuelLevel;
    boolean isFlying;

    public void description() {
        System.out.println("Борт " + name + "с "
                + fuelLevel + "тоннами топлива");
    }

    public void fly() {
        isFlying = true;
    }

    public void land() {
        isFlying = false;
    }
}
