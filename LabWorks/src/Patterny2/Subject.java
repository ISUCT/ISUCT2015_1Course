/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterny2;

/**
 *
 * @author stud_6
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver(Observer o);
    
}
