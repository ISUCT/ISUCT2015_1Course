/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author UI
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
