/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzafm;


public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("LA")) {
			if (type.equals("cheese")) {
				pizza = new LAStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new LAStyleVeggiePizza();
			} else if (type.equals("chicken")) {
				pizza = new LAStyleChickenPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new LAStylePepperoniPizza();
			}
		} else if (style.equals("Paris")) {
			if (type.equals("cheese")) {
				pizza = new ParisStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ParisStyleVeggiePizza();
			} else if (type.equals("chicken")) {
				pizza = new ParisStyleChickenPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ParisStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
    
}
