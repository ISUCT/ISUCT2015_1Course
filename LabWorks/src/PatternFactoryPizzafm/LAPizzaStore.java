/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactoryPizzafm;

/**
 *
 */
public class LAPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new LAStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new LAStyleVeggiePizza();
		} else if (item.equals("chicken")) {
			return new LAStyleChickenPizza();
		} else if (item.equals("pepperoni")) {
			return new LAStylePepperoniPizza();
		} else return null;
	}
    
}
