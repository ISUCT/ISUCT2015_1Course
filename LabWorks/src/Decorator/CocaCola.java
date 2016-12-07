/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author stud_6
 */
public class CocaCola extends CondimentDecorator {
    
	Beverage beverage;

	public CocaCola (Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Cola";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}