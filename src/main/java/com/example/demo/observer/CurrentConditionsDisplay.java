package com.example.demo.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

  private WeatherData weatherData;
  private String stateString;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.removeObserver(this);
  }

  public void setStateString(String stateString) {
    this.stateString = stateString;
  }

  @Override
  public void display() {
    System.out.println(stateString);
  }

  @Override
  public void update(State state) {
    setStateString(state.toString());
    display();
  }
}
