/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class Mouse {
    String name;
    int age;
    boolean isAngry;
    
    public void voice(){
        System.out.println("Меня зовут " + name + ", мне " + age + " месяц");
    }
    public void isAngry(){
        if (isAngry){
            System.out.println("Сердит");
        }else{
            System.out.println("Добр");
        }
    }
    
    public void saveMouse () {
        System.out.println("Спасается от кошки");
    } 
    
}
