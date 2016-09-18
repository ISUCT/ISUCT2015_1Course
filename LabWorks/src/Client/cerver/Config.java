/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;

import java.io.Serializable;
import java.util.ArrayList;


public class Config implements Serializable{
    private String text;
    private Double a;
    private Double b;
    private Double xn;
    private Double xk;
    private Double dx;
    ArrayList<Double> result;
    
    public ArrayList<Double> getResult() {
        return result;
    }

   public void setResult(ArrayList<Double> result) {
            this.result = result;
            
   }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
    
    public double getXn() {
        return xn;
    }
    
     public void setXn(double xn) {
        this.xn = xn;
    }
     
      public double getXk() {
        return xk;
    }
      
      public void setXk(double xk) {
        this.xk = xk;
    } 
      
      public double getDx() {
        return dx;
    }
      
      public void setDx(double dx) {
        this.dx = dx;
    } 
}

