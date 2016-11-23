/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author stud_6
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}