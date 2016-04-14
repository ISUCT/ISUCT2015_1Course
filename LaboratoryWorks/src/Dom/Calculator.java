/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dom;

import java.util.ArrayList;

/**
 *
 * @author UI
 */
public class Calculator {

    public double yCalc(double a, double x) {
        double y = Math.pow(a, Math.pow(x, 2) - 1)-Math.log10(Math.pow(x, 2)-1)+ Math.pow((Math.pow(x, 2)-1),1/3);
        return y;

    }
    public ArrayList<Double> TakB (ArrayList<Double> x,double a){
        ArrayList<Double> y = new ArrayList<Double> ();
        for (double i : x){
            y.add(yCalc(i, a));
        }
        return y; 
    }
  public ArrayList<Double> TakA(double xn, double xk, double dx, double a){
   ArrayList<Double> y = new ArrayList<Double> ();
    
   return y;
  }
}
