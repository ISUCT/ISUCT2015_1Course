/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author stud_17
 */
import java.util.*;

public class DotComBust {
    private final GameHelper helper = new GameHelper();
    private final ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Puppy.com");
        DotCom three = new DotCom();
        three.setName("Yandex.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Ваша цель: потопить три сайта");
        System.out.println("Pets.com, Puppy.com и Yandex.com");
        System.out.println("Попытайтесь потопить их за минимальное количество попыток");

        for (DotCom dotComSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            
            dotComSet.setLocationCells(newLocation);
            System.out.println(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты потоплены! Теперь кто-то лишился зарплаты :) ");
        if (numOfGuesses <= 18) {
            System.out.println("От вас потребовалось " + numOfGuesses + " попыток");
            System.out.println("Вы успели до того, как Вас уволили.");
        } else {
            System.out.println("Вы потратили большую сумму. ( " + numOfGuesses + ") попыток.");
            System.out.println("Слоны купаются в ваших вложениях.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    
    
}
