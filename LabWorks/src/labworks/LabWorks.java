/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author jskonst
 */
public class LabWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean logic = true; //false
        char charVar = 'a';
        byte b = 12;
        
        System.out.println(logic);
        System.out.println(charVar);
        System.out.println(b);
//        short
//        int
//        long
//        float
//        double
        
        //.....
        Dog a = new Dog();
        a.name = "Шарик";
        a.age = 2;
        a.isHungry = false;
        a.voice();
        //......
        
        Dog[] dogs = new Dog[3];
        
        dogs[0] = new Dog();
        dogs[0].name = "Джек";
        dogs[0].age = 3;
        dogs[0].isHungry = true;
        //.......
        
        int i = 0;
        while(i<dogs.length){
            dogs[i].voice();
            i=i+1;
        }
    }
}
