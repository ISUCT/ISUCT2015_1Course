/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author stud_17
 */
public class Cat {

    String name;
    int age;
    boolean isHungry;
    public void voise() {
        if (isHungry) {
            System.out.println("Меня зовут " + name + "мне" + age + "лет");
        }
    }

    public void isHungre() {
        if (isHungry) {
            System.out.println("Cпит");
        } else {
            System.out.println("гуляет сам по себе");

        }
    }

    void voice() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
