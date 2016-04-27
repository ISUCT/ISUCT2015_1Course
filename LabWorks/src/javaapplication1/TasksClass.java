/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author UI
 */
public class TasksClass {

    public double yCalc(double x) {
        double y = 0;
        if (x >= 1) {
            y = Math.pow(1.2, x) - Math.pow(x, 1.2);
        } else {
            y = Math.acos(x);
        }
        return y; 
    }
    public ArrayList<Double> TaskB(ArrayList<Double> x) {
        ArrayList<Double> y = new ArrayList<Double>();
        for (double i : x) {
            y.add(yCalc(i));
        }
        return y;
    }
    public ArrayList<Double> TaskA(double xn, double xk, double dx){
      ArrayList<Double> y = new ArrayList<Double> ();
      return y;
}
}

