/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class Pikachu {

String name; 
int age; 
boolean lightningStrike; 

public void voice(){
        System.out.println ("Меня зовут" + name + ", мне" + age + "лет" ); 
        
}
public void lightningStrike(){
    if (lightningStrike){ 
        System.out.println ("Удар молнией");
        
    }else{ 
        System.out.println ("Звуковая волна");
        
    }
    }
}
