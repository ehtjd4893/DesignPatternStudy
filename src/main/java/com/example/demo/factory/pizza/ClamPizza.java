package com.example.demo.factory.pizza;

import com.example.demo.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.example.demo.factory.ingredient.NYPizzaIngredientFactory;
import com.example.demo.factory.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;

  public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
    if (ingredientFactory instanceof NYPizzaIngredientFactory) {
      name = "NY-Style-ClamPizza";
    } else if (ingredientFactory instanceof ChicagoPizzaIngredientFactory) {
      name = "Chicago-Style-ClamPizza";
    }
  }

  @Override
  public void prepare() {
    System.out.println("준비 중: " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clams = ingredientFactory.createClam();
  }
}
