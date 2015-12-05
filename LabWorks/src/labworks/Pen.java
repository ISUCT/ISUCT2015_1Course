/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author Stud_17
 */
public class Pen {
    String name;
    int quantity;
    Boolean isRed;
    
    public void voice(){
            System.out.println("Это ручка"+name
            +", у меня"+ quantity +"ручек");
    }
    
    public void isRed(){
            if(isRed){
                System.out.println("Красная");
            }else{
                System.out.println("Синяя");
            }
    }
    
    public void writestext(){
        System.out.println("Пишет текст");
    }

}



