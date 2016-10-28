/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author stud_6
 */
public class WeatherData extends Observable{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){}
   
    public void registerObserver(java.util.Observer o) {
        observers.add(o);
    }

    public void removeObserver(java.util.Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

 //   @Override
 //   public void notifyObservers() {
 //       for (int i=0; i<observers.size(); i++){
 //       Observer observer = (Observer)observers.get(i);
 //       observer.update(temperature, humidity, pressure);
 //   }
 // }
  public void measurementsChanged() {
      setChanged();
      notifyObservers();
  }  
  public void setMeasurements (float temperature, float humidity, float pressure){
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      measurementsChanged();
  }  
  
  public float getTemperature(){
      return temperature;
  }
  public float getHumidity(){
      return humidity;
  }
  public float getPressure(){
      return pressure;
  }
  
}