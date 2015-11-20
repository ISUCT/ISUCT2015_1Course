/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author Ирина
 */
public class Book {
    String name;
    int pages;
    boolean isReaded;
    
    
    public void author(){
   System.out.println("Название" + name + "Страницы" + pages + "Прочитано" + isReaded);
    }
    
    public void isReaded(){
        if (isReaded){
            System.out.println("Прочитано");
        }else{
            System.out.println("Не прочитано");
        }
    }
}
