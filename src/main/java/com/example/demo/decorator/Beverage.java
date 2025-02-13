package com.example.demo.decorator;

public abstract class Beverage {

  public enum SizeEnum {TALL, GRANDE, VENTI};

  SizeEnum size = SizeEnum.TALL;
  String description = "제목 없음";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return size.name() + "사이즈, "+ getDescription() + ", $" + cost();
  }
}
