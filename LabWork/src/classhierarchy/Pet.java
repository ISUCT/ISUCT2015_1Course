/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classhierarchy;

/**
 *
 * @author stud_17
 */
public abstract class Pet {
 String name;
    int age;
    boolean hungry;
    abstract void voice();
    public void sleep() {}
    public void hunder (){}
    public void roam (){
     System.out.println("Meow");
    }
    void food() {
        hungry = true;
}
}   

