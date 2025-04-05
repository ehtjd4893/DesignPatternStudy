package com.example.demo.factory.store;

import com.example.demo.factory.ingredient.NYPizzaIngredientFactory;
import com.example.demo.factory.ingredient.PizzaIngredientFactory;
import com.example.demo.factory.pizza.CheesePizza;
import com.example.demo.factory.pizza.ClamPizza;
import com.example.demo.factory.pizza.Pizza;

public class NYstylePizzaStore extends PizzaStore {

  @Override
  Pizza
  createPizza(String type) {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("NY-Style-CheesePizza");
      }
      case "clam" -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("NY-Style-ClamPizza");
      }
      default -> pizza = null;
    }

    return pizza;
  }
}
