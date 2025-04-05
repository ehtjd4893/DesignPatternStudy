package com.example.demo.factory.pizza;

import com.example.demo.factory.ingredient.concreate.Pepperoni;
import com.example.demo.factory.ingredient.inter.Cheese;
import com.example.demo.factory.ingredient.inter.Clams;
import com.example.demo.factory.ingredient.inter.Dough;
import com.example.demo.factory.ingredient.inter.Sauce;
import com.example.demo.factory.ingredient.inter.Veggies;

public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Veggies[] veggies;
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clams;

  abstract public void prepare();

  public void bake() {
    System.out.println("175도에서 25분간 굽기");
  }

  public void cut() {
    System.out.println("피자를 사선으로 자르기");
  }

  public void box() {
    System.out.println("상자에 피자를 담기");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
