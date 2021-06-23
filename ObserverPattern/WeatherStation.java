package designpatternExample.ObserverPattern;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(33, 65, 30.4f);
        weatherData.setMeasurements(30, 60, 30.4f);
        weatherData.setMeasurements(28, 50, 30.4f);
    }
}
