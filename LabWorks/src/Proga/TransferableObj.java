/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;

import java.io.Serializable;

/**
 *
 * @author stud_5
 */
public class TransferableObj implements Serializable{
    private Double xn;
    private Double xk;
    private Double dx;
    private Double a;
    private Double b;

    public Double getXn() {
        return xn;
    }

    public void setXn(Double xn) {
        this.xn = xn;
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
    public Double getXk(){
        return xk;
    }
    public void setXk(Double xk) {
        this.xk = xk;
        
    }
    public Double getDx() {
        return dx;
    }
    public void setDx(Double dx) {
        this.dx = dx;
    }
}

    

