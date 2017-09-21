/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2poo2;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class WeatherData implements Subject{
    
    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;
    
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
        for(int i = 0; i<observers.size(); i++){
           Observer observer = observers.get(i);
           observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
