package com.example.demo.observer;

public class ForecastDisplay implements DisplayElement, Observer{
  private WeatherData weatherData;
  private String forecastString;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.removeObserver(this);
  }

  public void setForecastString(String forecastString) {
    this.forecastString = forecastString;
  }

  @Override
  public void display() {
    System.out.println(forecastString);
  }

  @Override
  public void update(State state) {
    String forecastStr;
    if (state.getTemperature() < 0) {
      forecastStr = "개추우니 집에 있으세요";
    } else if(state.getTemperature() < 10) {
      forecastStr = "쌀쌀할테니 따뜻하게 입으세요";
    } else {
      forecastStr = "날이 선선하니 좋네요!";
    }
    setForecastString(forecastStr);
    display();
  }
}
