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
        System.out.print(logic);
        char charVar = 'a';
        System.out.print(charVar);
        byte someByte = 12;
        System.out.print(someByte);
        short j = 19;
        System.out.print(j);
        int z = 27;
        System.out.print(z);
        long r = 30;
        System.out.print(r);
        float f = 32f;
        System.out.print(f);
        double k = 55;
        System.out.print(k);
        
        film y = new film();
        y.name = "Море";
        y.time = 120;
        y.prosmotreno = false;
        y.author();
             
        film[] film = new film[3];
        film[0] = new film();
        film[0].name = "Океан";
        film[0].time = 200;
        film[0].prosmotreno = true;
        
        film[1] = new film();
        film[1].name = "Лось";
        film[1].time = 50;
        film[1].prosmotreno = false;
        
        film[2] = new film();
        film[2].name = "Акула";
        film[2].time = 80;
        film[2].prosmotreno = true;
       
               
        
        int p = 0;
        while(p<film.length){
            film[p].author();
            p=p+1;
        }
        
     }
}
