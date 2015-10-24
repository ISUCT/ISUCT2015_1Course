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



 Pokemon a = new Pokemon();
        a.number = 017;
        a.evolvesfrom = "Egg";
        a.evolution = true;
        a.voice();
 Pokemon c = new Pokemon();
        c.number = 128;
        c.evolvesfrom = "Vulpix";
        c.evolution = false;
        c.voice();

 Pokemon d = new Pokemon();
        d.number = 144;
        d.evolvesfrom = "Machoke";
        d.evolution = true;
        d.voice();

        Pokemon[] pokemons = new Pokemon[3];
        pokemons[0] = new Pokemon();
        pokemons[0].number = 017;
        pokemons[0].evolvesfrom = "Egg";
        pokemons[0].evolution = true;
        
        pokemons[1] = new Pokemon();
        pokemons[1].number = 128;
        pokemons[1].evolvesfrom = "Vulpix";
        pokemons[1].evolution = false;
        
        pokemons[2] = new Pokemon();
        pokemons[2].number = 144;
        pokemons[2].evolvesfrom = "Machoke";
        pokemons[2].evolution = true;
    
        

        int i = 0;
        while (i < pokemons.length) {
            pokemons[i].voice();
            i = i + 1;
        }
    }
}
