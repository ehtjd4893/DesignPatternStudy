package com.example.demo.factory.store;

import com.example.demo.factory.pizza.NYStyleCheesePizza;
import com.example.demo.factory.pizza.NYstylePepperoniPizza;

public class NYstylePizzaStore extends PizzaStore {


  @Override
  Pizza createPizza(String type) {
    Pizza pizza;
    switch (type) {
      case "cheese" -> pizza = new NYStyleCheesePizza();
      case "pepperoni" -> pizza = new NYstylePepperoniPizza();
      default -> pizza = null;
    }

    return pizza;
  }
}
