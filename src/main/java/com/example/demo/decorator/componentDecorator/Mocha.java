package com.example.demo.decorator.componentDecorator;

import com.example.demo.decorator.Beverage;

public class Mocha extends BeverageDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }


  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.2;
  }
}
