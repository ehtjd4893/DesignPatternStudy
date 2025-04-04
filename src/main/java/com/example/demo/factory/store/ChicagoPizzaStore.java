package com.example.demo.factory.store;

import com.example.demo.factory.pizza.ChicagoPepperoniPizza;
import com.example.demo.factory.pizza.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  Pizza createPizza(String type) {
    Pizza pizza;
    switch (type) {
      case "cheese" -> pizza = new ChicagoStyleCheesePizza();
      case "pepperoni" -> pizza = new ChicagoPepperoniPizza();
      default -> pizza = null;
    }

    return pizza;
  }
}
