/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

/**
 *
 * @author stud_17
 */
public class LabWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        film y = new film();
        y.name = "Животные";
        y.time =100;
        y.prosmotreno = false;
        y.author();
        
        film[] film = new film[3];
        film[0] = new film();
        film[0].name = "Птицы";
        film[0].time = 150;
        film[0].prosmotreno = true;
        
        film[1] = new film();
        film[1].name = "Человек";
        film[1].time = 123;
        film[1].prosmotreno = true;
        
        film[2] = new film();
        film[2].name = "Планеты";
        film[2].time = 300;
        film[2].prosmotreno = true;
        
        int l = 0;
        while(l<film.length){
            film[l].author();
            l=l+1;
        }
    }
}
                
        
       
        
        
      
    

