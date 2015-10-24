/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author Akira
 */
public class Pokemon {
    

 int number; 
String evolvesfrom; 
boolean evolution; 

public void voice(){
        System.out.println ("Мой порядковый номер -" + number + ", меня можно получить из" + evolvesfrom); 
        
}
public void evolution(){
    if (evolution){ 
        System.out.println ("Эволюция есть");
        
}else{ 
        System.out.println ("Эволюции нет");
        
    }
    }
}