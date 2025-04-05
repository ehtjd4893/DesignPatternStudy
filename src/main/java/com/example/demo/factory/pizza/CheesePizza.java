package com.example.demo.factory.pizza;

import com.example.demo.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.example.demo.factory.ingredient.NYPizzaIngredientFactory;
import com.example.demo.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("준비 중: " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
  }
}
