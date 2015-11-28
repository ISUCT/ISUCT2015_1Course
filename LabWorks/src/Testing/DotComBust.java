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
import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Kitty.com");
        DotCom two = new DotCom();
        two.setName("Puppy.com");
        DotCom three = new DotCom();
        three.setName("Google.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Ваша цель: потопить три сайта");
        System.out.println("Kitty.com, Puppy.com и Google.com");
        System.out.println("Попытайтесь потопить их за минимальное количество попыток");

        for (DotCom dotComSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
            System.out.println(newLocation);
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

