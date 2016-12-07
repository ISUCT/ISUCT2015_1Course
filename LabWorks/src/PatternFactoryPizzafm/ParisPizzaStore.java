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
public class ParisPizzaStore  extends PizzaStore {
    Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ParisStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ParisStyleVeggiePizza();
        	} else if (item.equals("chicken")) {
        	    	return new ParisStyleChickenPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ParisStylePepperoniPizza();
        	} else return null;
	}
    
    
}
