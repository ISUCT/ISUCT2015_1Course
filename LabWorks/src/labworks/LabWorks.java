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
        boolean logic = false;
        System.out.println(logic);
        char charVar = 'a';
        System.out.println(charVar);
        byte b = 66;
        System.out.println(b);
        short s;
        s = b;
        System.out.println(s);
        int x = (int) 12;
        System.out.println(x);
        long dog = 6696669;
        System.out.println(dog);
        float h = 99.8f;
        System.out.println(h);
        double p = 5678.82;
        System.out.println(p);



        Pikachu a = new Pikachu();
        a.name = "312";
        a.age = 12;
        a.lightningStrike = true;
        a.voice();
        //один пикачу


        Pikachu[] pikachues = new Pikachu[3];
        pikachues[0] = new Pikachu();
        pikachues[0].name = "420";
        pikachues[0].age = 16;
        pikachues[0].lightningStrike = false;
        
        pikachues[1] = new Pikachu();
        pikachues[1].name = "20";
        pikachues[1].age = 3;
        pikachues[1].lightningStrike = false;
        
        pikachues[2] = new Pikachu();
        pikachues[2].name = "666";
        pikachues[2].age = 6;
        pikachues[2].lightningStrike = true;
        //больше пикачу   

        int i = 0;
        while (i < pikachues.length) {
            pikachues[i].voice();
            i = i + 1;
        }
    }
}
