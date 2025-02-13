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
    double cost = beverage.cost();

    if(beverage.getSize() == SizeEnum.TALL) {
      cost += 0.15;
    } else if(beverage.getSize() == SizeEnum.GRANDE) {
      cost += 0.2;
    } else {
      cost += 0.25;
    }

    return cost;
  }
}
