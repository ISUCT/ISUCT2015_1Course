/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author stud_6
 */
public class WithoutSugar extends Beverage {
	public WithoutSugar() {
		description = "WithoutSugar";
	}
 
	public double cost() {
		return 1.5;
	}
}
    