/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author stud_6
 */
public class DarkRoastCoffee extends Beverage {
	public DarkRoastCoffee() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .98;
	}
} 
    