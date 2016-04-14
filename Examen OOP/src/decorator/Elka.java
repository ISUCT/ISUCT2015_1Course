/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author stud_17
 */
public class Elka {

    public static void main(String args[]) {
        Ykrashenie ykrashenie = new Gerlyanda();
        ykrashenie = new Rose(ykrashenie);
        ykrashenie = new Zelenaya(ykrashenie);
        ykrashenie = new Zelenaya(ykrashenie);
        System.out.println(ykrashenie.getDescription());

        Ykrashenie ykrashenie2 = new Igryshki();
        ykrashenie2 = new Rose(ykrashenie2);
        ykrashenie2 = new Krasnaya(ykrashenie2);
        ykrashenie2 = new Zelenaya(ykrashenie2);
        System.out.println(ykrashenie2.getDescription());

        Ykrashenie ykrashenie3 = new Shariki();
        ykrashenie3 = new Rose(ykrashenie3);
        ykrashenie3 = new Krasnaya(ykrashenie3);
        ykrashenie3 = new Zelenaya(ykrashenie3);
        System.out.println(ykrashenie3.getDescription());
    }
}
