package com.example.demo.observer;

public class State {

  private int temperature;
  private int humidity;
  private int pressure;

  public State() {
  }

  public State(int temperature, int humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
  }

  @Override
  public String toString() {
    return "State{" +
        "temperature=" + temperature +
        ", humidity=" + humidity +
        ", pressure=" + pressure +
        '}';
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public int getPressure() {
    return pressure;
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
  }
}
