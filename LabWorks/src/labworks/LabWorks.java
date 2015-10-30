/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class LabWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean logic = true;
        System.out.println(logic);

        char charVar = 'a';
        System.out.println(charVar);

        byte someByte = 12;
        System.out.println(someByte);

        short someShort = 7;
        System.out.println(someShort);

        int someInt = 13;
        System.out.println(someInt);

        long someLong = 15;
        System.out.println(someLong);

        float someFloat = 9;
        System.out.println(someFloat);

        double someDouble = 10;
        System.out.println(someDouble);





        Cat a = new Cat();
        a.name = "Пушок";
        a.age = 3;
        a.isHungry = false;
        a.voice();
//...

        Cat[] cats = new Cat[3];

        cats[0] = new Cat();
        cats[0].name = "Рыжик";
        cats[0].age = 5;
        cats[0].isHungry = true;

        cats[1] = new Cat();
        cats[1].name = "Мася";
        cats[1].age = 7;
        cats[1].isHungry = true;

        cats[2] = new Cat();
        cats[2].name = "Вася";
        cats[2].age = 16;
        cats[2].isHungry = true;
//...
        int i = 0;
        while (i < cats.length) {
            cats[i].voice();
            i = i + 1;

        }



    }
}
