package simpledotcom;

/**
 *
 * @author anastasia
 */
import java.util.*;

public class SimpleDotComGame {

    public static void main (String[] args) {
        int numOfHits = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom com = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 10);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        com.setLocationCells(locations);
        boolean isAlive = true;
        com.startGame();
        
        while (isAlive == true) {
           
            String guess = helper.getUserInput("Введите число и нажмите Enter");
            String result = com.checkYourself(guess);
            numOfHits++;
            if (result.equals ("попал")) {
                isAlive = false;
                System.out.println("Вы потопили WeirdDolls.net");
                System.out.println("Вам потребовалось " + numOfHits + " попыток(и)");
            }
        }
    }    
}