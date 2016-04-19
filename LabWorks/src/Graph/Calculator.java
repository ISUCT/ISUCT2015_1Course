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
    public static void main(String[] args){
}
   public double yCalc(double x){
       double y = (Math.pow((Math.abs(Math.pow(x,2)-2.5)),1/4.0))+ Math.pow(Math.log10(Math.pow(x,2)),1/3.0);
       return y;
   }
   public ArrayList<Double> TaskA(double xn, double xk, double dx){
       ArrayList<Double> y = new ArrayList<Double>();
       for (double x=xn; x <= xk; x= x + dx) {
            y.add(yCalc(x));
       }
       return y;
   }
       
       public ArrayList<Double> TaskB(ArrayList<Double> x){
           ArrayList<Double> y = new ArrayList<Double>();
           for (double i : x) {
               y.add(yCalc(i));
           }
           return y;
       }        
               
} 