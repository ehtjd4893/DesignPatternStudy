package com.example.demo.decorator.componentDecorator;

import com.example.demo.decorator.Beverage;

public class Whip extends BeverageDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 휘핑";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.1;
  }
}
