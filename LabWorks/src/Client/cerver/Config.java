/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;

import java.io.Serializable;

/**
 *
 * @author stud_5
 */

public class Config implements Serializable{
    private String text;
    private Integer a;
    private Double b;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
    
}

