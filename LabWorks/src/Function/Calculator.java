/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
/**
 *
 * @author stud_5
 */
public class Calculator {
    public static void main(String[] args) {
        
    }
    
    public double yCalc(double x, double a, double b) {
        double chisl = (1+Math.pow(Math.log(x/a), 2));
        double zn = (Math.exp(x/a));
        return chisl / zn;
    }
    
    public ArrayList<Double> TaskB(ArrayList<Double> x, double a, double b) {
        ArrayList<Double> n = new ArrayList<Double>();
        for (double i : x) {
            n.add(yCalc(i, a, b));
        }
        return n;
    }
    public ArrayList<Double> TaskA(double xn, double xk, double dx, double a, double b){
      ArrayList<Double> n = new ArrayList<Double> ();
      return n;
}
}