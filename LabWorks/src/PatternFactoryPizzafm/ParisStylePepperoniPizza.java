/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzafm;

/**
 *

 */
public class ParisStylePepperoniPizza extends Pizza {
    public ParisStylePepperoniPizza() {
		name = "Paris Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Cheese Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
                toppings.add("Dill");
                
	}
 
    
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
    
}
