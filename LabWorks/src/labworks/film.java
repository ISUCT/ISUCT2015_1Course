/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class film {
    String name;
    int time;
    boolean prosmotreno;
    
    public void author(){
        System.out.println("Название фильма" + name + "Время" + time + "Просмотрено" + prosmotreno);
          }
    public void prosmotreno(){
        if (prosmotreno){
            System.out.println("Просмотрено");
            }else{
            System.out.println("Не просмотрено");
        }
        }
    }

