/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Akira
 */
import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }

    void setName(String puppycom) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

