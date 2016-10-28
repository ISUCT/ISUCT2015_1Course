/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author UI
 */
   public interface Subject {
    
    public void registerObserver(observer o);
    public void removeObserver(observer o);
    public void notifyObservers();
  } 

