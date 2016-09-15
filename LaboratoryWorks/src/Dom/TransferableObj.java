/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dom;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author stud
 */
public class TransferableObj  implements Serializable{
    private Double xn;
    private Double xk;
    ArrayList<Double> result;

    public ArrayList<Double> getResult() {
        return result;
    }

    public void setResult(ArrayList<Double> result) {
        this.result = result;
    }
    public Double getXn() {
        return xn;
    }

    public void setXn(Double xn) {
        this.xn = xn;
    }

    public Double getXk() {
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

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }
    private Double dx;
    private Double a;
}