
package testing;

import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("vk.com");
        DotCom two = new DotCom();
        two.setName("mail.ru");
        DotCom three = new DotCom();
        three.setName("steamcommunity.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Ваша цель: потопить три сайта");
        System.out.println("vk.com, mail.ru и steamcommunity.com");
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
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят. ");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
            System.out.println("Вы успели выбратся до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. "+ numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
