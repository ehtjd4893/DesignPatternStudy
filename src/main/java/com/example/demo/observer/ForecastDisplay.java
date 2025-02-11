package com.example.demo.observer;

public class ForecastDisplay implements DisplayElement, Observer{
  private WeatherData weatherData;
  private State state;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.removeObserver(this);
  }

  @Override
  public void display() {
    String forecastStr;
    if (state.getTemperature() < 0) {
      forecastStr = "개추우니 집에 있으세요";
    } else if(state.getTemperature() < 10) {
      forecastStr = "쌀쌀할테니 따뜻하게 입으세요";
    } else {
      forecastStr = "날이 선선하니 좋네요!";
    }
    System.out.println(forecastStr);
  }

  @Override
  public void update() {
    this.state = weatherData.getState();
    display();
  }
}
