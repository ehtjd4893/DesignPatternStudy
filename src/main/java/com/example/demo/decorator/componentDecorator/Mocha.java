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
    double cost = beverage.cost();

    if(beverage.getSize() == SizeEnum.TALL) {
      cost += 0.2;
    } else if(beverage.getSize() == SizeEnum.GRANDE) {
      cost += 0.25;
    } else {
      cost += 0.3;
    }

    return cost;
  }
}
