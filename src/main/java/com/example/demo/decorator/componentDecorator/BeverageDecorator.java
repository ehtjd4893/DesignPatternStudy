package com.example.demo.decorator.componentDecorator;

import com.example.demo.decorator.Beverage;

public abstract class BeverageDecorator extends Beverage {
  Beverage beverage;

  public abstract String getDescription();
}
