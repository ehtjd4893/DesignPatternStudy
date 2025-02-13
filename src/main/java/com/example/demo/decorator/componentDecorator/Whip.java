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
    double cost = beverage.cost();

    if(beverage.getSize() == SizeEnum.TALL) {
      cost += 0.1;
    } else if(beverage.getSize() == SizeEnum.GRANDE) {
      cost += 0.15;
    } else {
      cost += 0.2;
    }

    return cost;
  }
}
