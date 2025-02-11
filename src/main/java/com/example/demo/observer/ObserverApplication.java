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
      if (i % 5 == 0 ) {
        ob2.update();
      } if (i % 10 == 0) {
        ob1.update();
      } if (i % 15 == 0) {
        ob3.update();
      }

    }
  }
}
