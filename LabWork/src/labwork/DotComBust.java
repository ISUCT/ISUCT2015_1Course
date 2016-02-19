/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

import java.util.ArrayList;

/**
 *
 * @author stud_17
 */
public class DotComBust {
   private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Google.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Ваша цель - потопить три 'cайта'.");
        System.out.println("Pets.com и eToys.com,Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество попыток");

        for (DotCom dotComToSet :dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Введите число");
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
            System.out.println("Вы успели до того, как Вам откусили руку.");
        } else {
            System.out.println("Вы потратили дофига ( " + numOfGuesses + ") попыток.");
            System.out.println("Голодающие уже пришли по вашу душу");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
 

