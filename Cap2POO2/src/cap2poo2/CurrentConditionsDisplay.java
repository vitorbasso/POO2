/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2poo2;

/**
 *
 * @author vitor
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    @Override
    public void display(){
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity.\n");
    }
    
}
