/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzafm;


public class ParisStyleCheesePizza extends Pizza  {
    public ParisStyleCheesePizza() { 
		name = "Paris Style Deep Dish Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
 
    

