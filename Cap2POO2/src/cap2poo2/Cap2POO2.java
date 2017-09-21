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
public class Cap2POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(35,40,22.5f);
        
    }
    
}
