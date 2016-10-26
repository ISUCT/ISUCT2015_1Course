/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author stud_6
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
  //  private Subject weatherData;
    
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

   
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){ 
           WeatherData weatherData = (WeatherData) obs;
           this.temperature = weatherData.getTemperature();
           this.humidity = weatherData.getHumidity();
           display();
    }
    }
   
    @Override
    public void display() {
        System.out.println("Текущие показания: " + temperature + "F градусов "+ humidity + "% влажности");
    }
}

    

