package destroy.the.world;

import java.util.*;

public class DestroyTheWorld {  
    
    public static void main(String[] args) {
        
    }
    
    int x;
   
    public void destroy() {
        System.out.println("AHAHAHAHAHAHA!!");
        System.out.println("Your world has been destroyed");
    }
    
    public void starGame() {
                

        
        GameHelper helper = new GameHelper();      
        String guess = helper.getUserInput("Введите число и нажмите Enter");
        

        if (x == 0 || x == 666) {
            DestroyTheWorld d = new DestroyTheWorld();
            d.destroy();
        } else {
            System.out.println("You are lucky!");
            System.out.println("You didn't meet the Devil");
        }
    }    
}       
