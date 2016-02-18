/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author jskonst
 */
public class Dog {

    String name;
    private int age;

    public void setAge(int aAge) {
        if (aAge == 0) {
            System.out.println("Возраст должен быть больше 0");
        } else {
            age = Math.abs(aAge);
        }
    }

    public int getAge() {
        return age;
    }
    boolean isHungry;
    //геттеры  //аксепторы
    //сеттеры  //мутаторы
    //GUI - graphical user interface 

    public void voice() {
        System.out.println("Меня зовут " + name
                + ", мне " + age + "лет");
    }

    public void displayIsHungry() {
        if (isHungry) {
            System.out.println("Голоден");
        } else {
            System.out.println("Сыт");
        }
    }

    public void chaseCat() {
        System.out.println("Ловит кошку");
    }

//    FAQ - Frequently asked questions
//    ЧАВО - часто задаваемые вопросы
//    MAN - manual
    public int max(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;

    }
}
