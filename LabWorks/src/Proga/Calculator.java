/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;
import java.util.ArrayList;
/**
 *
 * @author UI
 */
public class Calculator {
  public double yCalc(double x,double a, double b){
      double y;
      y = Math.asin(Math.pow( x, a)) + Math.acos(Math.pow(x, b));
      return y;
  }
  public ArrayList<Double> TakB (ArrayList<Double> x,double a, double b){
      ArrayList<Double> y = new ArrayList<Double> ();
      for (double i : x){
        y.add(yCalc(i, a, b));
      }
      return y;
      }
  public ArrayList<Double> TaskA(double xn, double xk, double dx, double a, double b){
      ArrayList<Double> y = new ArrayList<Double> ();
      for (double x=xn; x<xk; x+=dx) {
            y.add(yCalc(x, a, b));
      }
      return y;
  }
}
      
      
      
  
//   float a = 2.0f;
//   float b = 3.0f;
//   float x = 0.11f;
    


