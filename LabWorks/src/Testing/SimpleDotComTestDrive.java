/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Данила
 */
public class SimpleDotComTestDrive {
    /**
     * 
     * @param args 
     */
    public static void main (String[] args) {
       DotCom dot = new DotCom();
       int[] locations = {2,3,4};
       dot.setLocationCells(locations);
       String userGuess = "2";
       String result = dot.checkYourself(userGuess);
    }

    
}