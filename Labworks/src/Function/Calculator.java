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
    
    public static void main(String[] args){
    }
    public double yCalc(double x, double a, double b) {
        double chisl = Math.acos(Math.pow(x,2)-Math.pow(b,2));
        double zn = Math.asin(Math.pow(x, 2)-Math.pow(a,2));
        return chisl/zn;
    }
    
    public ArrayList<Double> z(ArrayList<Double> x, double a, double b) {
        ArrayList<Double> n = new ArrayList<Double>();
        for (double i : x) {
            n.add(yCalc(i,a,b));
        } 
        return n;
    }
   
    public ArrayList<Double> d(double xn, double xk, double dx, double a, double b){
        ArrayList<Double> n = new ArrayList<Double>();
        for (double x=xn; x<xk; x+=dx) {
            n.add(yCalc(x,a,b));
        }
        return n;
    }
    
}
