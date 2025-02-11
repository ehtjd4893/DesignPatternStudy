package com.example.demo.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

  private WeatherData weatherData;
  private State state;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.removeObserver(this);
  }

//  public void setStateString(String stateString) {
//    this.stateString = stateString;
//  }

  @Override
  public void display() {
    System.out.println(this.state.toString());
  }

  @Override
  public void update() {
    this.state = weatherData.getState();
    display();
  }
}
