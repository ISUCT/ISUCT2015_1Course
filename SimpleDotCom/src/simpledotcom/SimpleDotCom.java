package simpledotcom;

/**
 *
 * @author anastasia
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }  
    
    public void startGame() {
         System.out.println("Ваша задача - потопить WeirdDolls.net");
    }
    
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
        System.out.println(result);
        return result;
    }
}