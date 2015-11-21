/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcom;

/**
 *
 * @author anastasia
 */

public class SimpleDotComGame {
    int[] locationCells;
    int numOfHits = 0;
    
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "попал";
                numOfHits++;
                break;
            }
        } 
        
        if (numOfHits == locationCells.length) {
            result = "потопил";
        }
        return result;
    }
    
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}
