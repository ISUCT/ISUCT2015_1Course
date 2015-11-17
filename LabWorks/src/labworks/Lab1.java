/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author Алена
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean log = true; //or false;
        char charP = 'k';
        byte j = 22;
        short q = 128;
        int z = 15987;
        long f = 56876211;
        float m = 241.87f;
        double r = 5688.10;
        
        System.out.println (log);
        System.out.println (charP);
        System.out.println (j);
        System.out.println (q);
        System.out.println (z);
        System.out.println (f);
        System.out.println (m);
        System.out.println (r);
        
        
        
        
        
        Racoon k = new Racoon();
        k.name = "Joe";
        k.age = 5;
        k.isGood = true;
        k.voice();
        
        Racoon[] racoons = new Racoon [3];
        racoons [0] = new Racoon ();
        racoons [0].name = "Jonny";
        racoons [0].age = 7;
        racoons [0].isGood = false;
        
        racoons [1] = new Racoon ();
        racoons [1].name = "Pit";
        racoons [1].age = 1;
        racoons [1].isGood = true;
        
        racoons [2] = new Racoon ();
        racoons [2].name = "Elsa";
        racoons [2].age = 10;
        racoons [2].isGood = false;
        
        
        int i=0;
        while (i < racoons.length){
            racoons[i].voice ();
            i = i + 1;
        }
    }
    
}
