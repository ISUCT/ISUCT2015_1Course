package simpledotcom;

/**
 *
 * @author anastasia
 */
import java.util.*;

/**
 *
 * @author anastasia
 */
public class SimpleDotComGame {

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom com = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        com.setLocationCells(locations);
        boolean isAlive = true;
        
        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число и нажмите Enter");
            String result = com.checkYourself(guess);
            numOfGuesses++;
            if (result.equals ("потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }
        }
    }    
}