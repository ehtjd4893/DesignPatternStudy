package com.example.demo.decorator.componentDecorator;

import com.example.demo.decorator.Beverage;

public class Soy extends BeverageDecorator {
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 두유";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.15;
  }
}
