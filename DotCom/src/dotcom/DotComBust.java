package dotcom;

/**
 *
 * @author anastasia
 */
import java.util.*;

public class DotComBust {
    
    public static void main (String[] args) {
        
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startGame();
    }
    
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfHits = 0;
    
    private void setUpGame() {
        
        DotCom a = new DotCom();
        a.setName ("Puppies.com");

        DotCom b = new DotCom();
        a.setName ("WeirdDolls.net");
        
        DotCom c = new DotCom();
        a.setName ("Libre.com");        
        
        dotComsList.add(a);
        dotComsList.add(b);
        dotComsList.add(c);
        
        System.out.println("Ваша цель - потопить все три сайта: ");
        System.out.println("Puppies.com, WeirdDolls.net и Libre.com");
        System.out.println("Чем меньше ходов - тем лучше");
        
        for (DotCom dotComToSet : dotComsList) {
            
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }    
    }
    
    private void checkUserGuess(String userGuess) {
        
        numOfHits++;
        String result = "мимо";
        
        for (DotCom dotComToTest : dotComsList) {
            
            result = dotComToTest.checkYourself(userGuess);
                    
            if (result.equals ("потопил")) {
                
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        
        System.out.println(result);
    }
    
    private void startGame() {
        
        while(!dotComsList.isEmpty()) {
            
            String userGuesses = helper.getUserInput("Сделайте ход и нажмите Enter ");
            checkUserGuess(userGuesses);
            
        }
        
        finishGame();
    }
    
    private void finishGame() {
                
        if (numOfHits <= 18) {
            
            System.out.println("ПОЗДРАВЛЯЕМ! Вы потопили все сайты! Ваши акции теперь ничего не стоят...");
            System.out.println("Вы использовали " + numOfHits + " выстрелов");
            System.out.println("Молодцы!");
        
        } else {
            
            System.out.println("И хотя вы потопили все сайты... ");
            System.out.println("Слишком много промахов! " + numOfHits + " - мазила");
            System.out.println("Вы никудышный бизнесмен");
          
        }    
    }
}
