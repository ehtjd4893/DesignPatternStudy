package com.example.demo.observer;

public class StaticsDisplay implements DisplayElement, Observer {

  private WeatherData weatherData;
  private String staticsString;

  public StaticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.removeObserver(this);
  }

  @Override
  public void display() {
    System.out.println(staticsString);
  }

  public void setStaticsString(String staticsString) {
    this.staticsString = staticsString;
  }

  @Override
  public void update(State state) {
    String statics = "평균기온은 " + state.getTemperature() + "도, 평균 기압은" + state.getPressure() + ", 평균 습도는 " + state.getHumidity() + "로 예상됩니다.";
    setStaticsString(statics);
    display();
  }
}
