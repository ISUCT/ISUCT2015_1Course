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
        double y = (Math.pow(b, 3) + Math.pow(Math.sin(a * x), 2)) / Math.acos(x * b * x) + Math.exp(-x / 2);
        return y;
    }

}
