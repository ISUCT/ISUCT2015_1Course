/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decor;

/**
 *
 * @author UI
 */
public class WithoutSugar extends Beverage {
	public WithoutSugar() {
		description = "WithoutSugar";
	}
 
        @Override
	public double cost() {
		return 1.5;
	}
}
    

