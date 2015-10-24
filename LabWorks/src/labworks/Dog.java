/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author jskonst
 */
public class Dog {
    String name;
    int age;
    boolean isHungry;
    
    public void voice(){
        System.out.println("Меня зовут " + name +
                ", мне " + age + "лет");
    }
    public void isHungry(){
        if (isHungry){
            System.out.println("Голоден");
        }else{
            System.out.println("Сыт");
        }
    }
    
}
