package dotcom;

/**
 *
 * @author anastasia
 */
import java.util.*;

public class DotCom {

    public String name;
    private ArrayList<String> locationCells;
    
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    
    public void setName(String n) {
        
        name = n;
        
    }
    
    public String checkYourself(String userInput) {
        
        String result = "мимо";
        int index = locationCells.indexOf(userInput);
        
        if (index >= 0) {
            
            locationCells.remove(index);
            
            if (locationCells.isEmpty()) {
                
                result = "потопил";
                System.out.println("Вы потопили " + name);
            
            } else {
            
                result = "попал";
            
            }
        }
        
        return result;
        
    }
}