/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzafm;

/**
 *
 *
 */
public class ParisStyleVeggiePizza extends Pizza {
    public ParisStyleVeggiePizza() {
		name = "Paris Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Tomato");
	}
 
   
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
    
}
