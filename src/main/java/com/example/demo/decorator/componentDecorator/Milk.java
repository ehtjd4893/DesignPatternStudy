package com.example.demo.decorator.componentDecorator;

import com.example.demo.decorator.Beverage;

public class Milk extends BeverageDecorator {

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 우유";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.1;
  }
}
