/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class Cat {
    String name;
    int age;
    boolean isHungry;
    
    public void voice() {
            System.out.println("Меня зовут " + name + ", мне " + age + "год");
    }
    
    public void isHungry() {
        if (isHungry) {
            System.out.println ("Голоден");
       } else {
            System.out.println ("Сыт");
        } 
    }
         
    public void runfromDog () {
    System.out.println ("Убегает от собаки") ;
    }
    public class LabWorks {

    /**
     * @param args the command line arguments
     */
    }
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
        a.name = "Фокс";
        a.age = 1;
        a.isHungry = false;
        a.voice();
        //......
        
        Cat[] cats = new Cat[3];
        
        cats[0] = new Cat();
        cats[0].name = "Ли";
        cats[0].age = 2;
        cats[0].isHungry = true;
        //.......
        
        int i = 0;
        while(i<cats.length){
            cats[i].voice();
            i=i+1;
        }
    }
}

