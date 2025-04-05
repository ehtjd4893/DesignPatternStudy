package com.example.demo.factory.store;

import com.example.demo.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.example.demo.factory.ingredient.PizzaIngredientFactory;
import com.example.demo.factory.pizza.CheesePizza;
import com.example.demo.factory.pizza.ClamPizza;
import com.example.demo.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  Pizza createPizza(String type) {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago-Style-CheesePizza");
      }
      case "clam" -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("Chicago-Style-ClamPizza");
      }
      default -> pizza = null;
    }

    return pizza;
  }
}
