package com.example.demo.observer;

public class ObserverApplication {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    Observer ob1 = new CurrentConditionsDisplay(weatherData);
    Observer ob2 = new StaticsDisplay(weatherData);
    Observer ob3 = new ForecastDisplay(weatherData);

    State newState = new State(-15, 50, 100);

    for (int i = 1; i <= 20; i++) {
      System.out.println("i = " + i);
      newState.setTemperature(newState.getTemperature() + 5);
      weatherData.setState(newState);
      if (i == 5) {
        weatherData.removeObserver(ob2);
      } else if (i == 10) {
        weatherData.removeObserver(ob3);
      } else if (i == 15) {
        weatherData.removeObserver(ob1);
      }

    }
  }
}
