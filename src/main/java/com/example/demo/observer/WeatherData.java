package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observerList;

  private State state;

  public WeatherData(State state) {
    this.observerList = new ArrayList<>();
    this.state = state;
  }

  public WeatherData() {
    this.observerList = new ArrayList<>();
    this.state = new State();
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(displayElement -> {
      displayElement.update(state);
    });
  }

  @Override
  public void setState(State state) {
    boolean changed = false;

    if (this.state.getTemperature() != state.getTemperature()) {
      this.state.setTemperature(state.getTemperature());
      changed = true;
    }
    if (this.state.getHumidity() != state.getHumidity()) {
      this.state.setHumidity(state.getHumidity());
      changed = true;
    }
    if (this.state.getPressure() != state.getPressure()) {
      this.state.setPressure(state.getPressure());
      changed = true;
    }

    if (changed) {
      notifyObservers();
    }
  }

}
