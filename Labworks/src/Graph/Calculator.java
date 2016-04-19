/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author UI
 */
import java.util.ArrayList;
public class Calculator {

     public ArrayList<Double> fn(double xn, double xk, double dx, double a, double b) {
        ArrayList<Double> y = new ArrayList<>();
        for (double x=xn; x<xk; x+=dx) {
            y.add(yCalc(x, a, b));
        }
        return y;
    }  
     
     public ArrayList<Double> zn(ArrayList<Double> x, double a, double b) {
        ArrayList<Double> y = new ArrayList<>();
        for(double i: x) {
        y.add(yCalc(i, a, b));
        }
        return y;
    }    

    double yCalc(double x, double b, double a) {
        double y = (Math.pow(b, 3) + Math.pow(Math.sin(a * x), 2)) / Math.acos(x * b * x) + Math.exp(-x / 2);
        return y;
    }

}
