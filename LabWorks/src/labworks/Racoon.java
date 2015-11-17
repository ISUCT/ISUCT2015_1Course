/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author Алена
 */
public class Racoon {
    String name;
    int age;
    boolean isGood;
    
    public void voice(){
        System.out.println("My name is " + name + ", i am " + age + " years old.");
    }
    
    public void isGood(){
        if (isGood){
            System.out.println("Хороший");
        }else{
            System.out.println("Вредина");
        }
    }
        
    public void StealCookies (){
        System.out.println ("Крадет печеньки");
    }
}