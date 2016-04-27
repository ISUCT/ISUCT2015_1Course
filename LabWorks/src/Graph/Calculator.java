/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;

/**
 *
 * @author UI
 */
public class Calculator {

    public double yCalc(double x, double a, double b) {
        double y = Math.pow(Math.pow(a, x) + b, 1 / 3) / (Math.log10(Math.pow(x, 2)));
        return y;
        
    }
    public ArrayList<Double> TaskA(double xn, double xk, double dx, double a, double b ){
       ArrayList<Double> y = new ArrayList<Double>();
       for (double x=xn; x <= xk; x= x + dx) {
            y.add(yCalc(x, a, b ));
       }
       return y;
   }

    public ArrayList<Double> TaskB(ArrayList<Double> x, double a, double b) {
        ArrayList<Double> y = new ArrayList<Double>();
        for (double i : x) {
            y.add(yCalc(i, a, b));
        }
        return y;

    }
}
    