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

    public double yCalc(double x, double a, double b) {
        double y = Math.pow(Math.pow(a, x) + b, 1 / 3)/(Math.log10(Math.pow(x, 2))); 
        return y;
    }
}
