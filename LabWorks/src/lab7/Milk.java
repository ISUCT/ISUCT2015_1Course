/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author stud_6
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}