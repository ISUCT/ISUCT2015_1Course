/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author stud_17
 */
abstract class Animal {
    String name;
    public void eat(){
    System.out.println(hashCode() + " is eating"); }
    
    public void sleep(){
    System.out.println(name + "sleep" ); }
    public void comeHome(){}
    public void hunger(){}
    
    public void roam(){
   System.out.println(name + "seek the food") ;
    }
}
 