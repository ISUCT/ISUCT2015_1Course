/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzas;


public class ChickenPizza extends Pizza {
    public ChickenPizza() {
		name = "Chicken Pizza";
		dough = "Thin crust";
		sauce = "White sauce";
		toppings.add("Chicken");
		toppings.add("Grated parmesan cheese");
                toppings.add("Dill");
                
	}
    
}
