/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author stud_17
 */
public class LabWork {
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
        Cat a = new Cat();
        a.name = "джозаф";
        a.age = 2;
        a.isHungry = false;
        a.voise();
        //......
        
        Cat[] dogs = new Cat[3];
        
        dogs[3] = new Cat();
        dogs[3].name = "Панин";
        dogs[3].age = 3;
        dogs[3].isHungry = true;
        //.......
        
        int i = 0;
        while(i<dogs.length){
            dogs[i].voice();
            i=i+1;
        }
}}
