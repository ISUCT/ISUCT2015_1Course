package findcats;

import java.util.Map;

public class FindCats {
    
    public static void main(String[] args) {
        
        boolean isFound = false;
        GameHelper helper = new GameHelper();
        int numOfGuess = 0;
        String[] location = {"Right", "Left"};
        int randomNum = (int) (Math.random() * location.length);
        Cat cat = new Cat();
        cat.setLocation(randomNum);        
        cat.setName();
        
        while (isFound == false) {            
            String guess = helper.getUserInput("Enter your answer");
        }
    }
}
