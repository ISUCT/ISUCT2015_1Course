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
        System.out.println(logic);
        char charVar = 'a';
        System.out.println(charVar);
        byte someByte = 12 ;
        System.out.println (someByte);
        short someShort = 5;
        System.out.println (someShort);
        int someInt = 8;
        System.out.println (someInt);
        long someLong = 6;
        System.out.println (someLong);
        float someFloat = 4;
        System.out.println (someFloat);
        double someDouble = 7;
        System.out.print (someDouble);
   
        Elephant a = new Elephant();
        a.name = "Григорий";
        a.age = 2;
        a.isHungry = false;
        a.aboutme();
        //...
        
        
        
        Elephant[] elephants = new Elephant[3];
        
        elephants[0] = new Elephant();
        elephants[0].name = "Миша";
        elephants[0].age = 3;
        elephants[0].isHungry = true;
        
        elephants[1] = new Elephant();
        elephants[1].name = "Саша";
        elephants[1].age = 4;
        elephants[1].isHungry = true;
        
        elephants[2] = new Elephant();
        elephants[2].name = "Ваня";
        elephants[2].age = 5;
        elephants[2].isHungry = true;
        
        
        
        int i = 0;
        while(i<elephants.length){
            elephants[i].aboutme();
            i=i+1;
            
            
        }
        
       
        }   
  
}
   