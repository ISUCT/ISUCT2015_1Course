/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Ирина
 */
public class SimpleDotCom {
    
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    
    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result ="Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        
        if (numOfHits ==
            locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
            return result;
    }
}