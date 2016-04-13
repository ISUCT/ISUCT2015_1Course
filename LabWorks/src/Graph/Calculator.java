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
public class Calculator {
   public double yCalc(double x){
       double y = (Math.pow((Math.abs(Math.pow(x,2)-2.5)),1/4))+ Math.pow(Math.log10(Math.pow(x,2)),1/3);
       return y;
               
               
     } 
}
