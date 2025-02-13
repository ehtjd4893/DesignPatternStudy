package com.example.demo.decorator;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "하우스 블렌드";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
