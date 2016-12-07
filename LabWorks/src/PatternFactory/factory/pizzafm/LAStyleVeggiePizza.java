/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactory.factory.pizzafm;

/**
 *
 * 
 */
public class LAStyleVeggiePizza extends Pizza {

	public LAStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Mocarella Cheese");
		toppings.add("Garlic");
		toppings.add("Dill");
		toppings.add("Mushrooms");
                toppings.add("Tomato");
		toppings.add("Red Pepper");
	}
}
