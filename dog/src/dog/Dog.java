
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author stud_17
 */
public class Dog {

    String name;
    int age;
    boolean isHungry;

    /**
     * @param args the command line arguments
     */
    public void voice() {
        System.out.println("Меня зовут" + name + ",мне " + age + "лет");
    }

    public void isHungry() {
        if (isHungry) {
            System.out.println("Голоден");
        } else {
            System.out.println("Сыт");
        }
    }

    public void saveHuman() {
        System.out.println("Спасает человека");
    }
}
// TODO code application logic here

