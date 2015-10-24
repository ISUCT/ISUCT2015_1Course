/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class Book {
    String name;
    int pages;
    boolean read;
    
    
    public void author(){
   System.out.println("Название " + name + "Страницы" +pages + "Прочитано"  + read);
   }
    
    public void read(){
        if (read){
            System.out.println("Прочитано");
        }else{
            System.out.println("Не прочитано");
        }
        }
    }
