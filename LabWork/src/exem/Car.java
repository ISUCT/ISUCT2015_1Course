/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exem;

/**
 *
 * @author stud_17
 */
public class Car {

    static int distance;

    public void start() {
    }

    public void stop() {
    }

    public int drive(int howlong) {
        distance = howlong * 60;
        return (distance);

    }

    public static void main(String[] args) {
        Car myCar = new Car();
        int d = myCar.drive(30);

        System.out.println(d);
    }
}
