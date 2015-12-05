package destroy.the.world;

import java.util.*;

public class DestroyTheWorld {


    public static void main(String[] args) {
        
        int num = (int) (Math.random()*10);
        
        Animal a = new Animal();
        a.voice();
        a.play();
        a.setName();
        Animal b = new Animal();
        a.play();

        
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        
        scores.put("Cat", 1);
        scores.put("Doggy", 2);
        scores.put("Chaosic", 0);
        scores.put("Lion", 3);
        scores.put("Penguin", 4);
        scores.put("Fish", 5); 
        
    }    
        
        
        public void destroyWorld() {
            
            System.out.println("AHAHAHAHAHAHA!!");
            System.out.println("Your world has been destroyed");
            
        }
        
        public void starGame() {
            
            GameHelper helper = new GameHelper();
            GameHelper2 helper2 = new GameHelper2();
            
            String guess = helper.getUserInput("Введите число и нажмите Enter");
            
            //if (guess) {
            //сначала проверяется был ли выбран Chaosic
                
                String guesses = helper2.getUserInput("Введите число и нажмите Enter");
                
                //boolean Guess = guesses;
                // далее вводится "код остановки уничтожения" (либо 0, либо 666)
                
                //if (Guesses) {
                
                   //destroy();
                
                //} else {
                        
                    System.out.println("You are lucky!");
                    System.out.println("You didn't meet the Devil");
                        
                }
}
