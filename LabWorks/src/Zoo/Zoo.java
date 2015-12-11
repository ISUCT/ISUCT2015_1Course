/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Akira
 */
public class Zoo {

    public static void main(String[] args) {
        Animal a = new Cat();
        a.animal = "Cat";
        a.name = "Miku";
        a.voice();
        a.deepSleep = true;
        a.sleeping();
        System.out.println(" ");

        Animal b = new Lion();
        b.animal = "Lion";
        b.name = "Luka";
        b.voice();
        b.deepSleep = false;
        b.sleeping();
        System.out.println(" ");

        Animal c = new Cat();
        c.animal = "Cat";
        a.name = "Kaito";
        a.voice();
        a.deepSleep = false;
        a.sleeping();
        System.out.println(" ");

        Animal d = new Lion();
        d.animal = "Lion";
        a.name = "Rin";
        a.voice();
        a.deepSleep = true;
        a.sleeping();
        System.out.println(" ");

    }

}
