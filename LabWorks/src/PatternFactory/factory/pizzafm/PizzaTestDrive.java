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
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore laStore = new LAPizzaStore();
		PizzaStore parisStore = new ParisPizzaStore();
 
		Pizza pizza = laStore.orderPizza("cheese");
		System.out.println("John ordered a " + pizza.getName() + "\n");
 
		pizza = parisStore.orderPizza("cheese");
		System.out.println("Mary ordered a " + pizza.getName() + "\n");

		pizza = laStore.orderPizza("chicken");
		System.out.println("John ordered a " + pizza.getName() + "\n");
 
		pizza = parisStore.orderPizza("chicken");
		System.out.println("Mary ordered a " + pizza.getName() + "\n");

		pizza = laStore.orderPizza("veggie");
		System.out.println("John ordered a " + pizza.getName() + "\n");
 
		pizza = parisStore.orderPizza("veggie");
		System.out.println("Mary ordered a " + pizza.getName() + "\n");
	}
}