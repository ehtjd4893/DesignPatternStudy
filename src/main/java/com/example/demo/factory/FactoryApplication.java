package com.example.demo.factory;

import com.example.demo.factory.store.ChicagoPizzaStore;
import com.example.demo.factory.store.NYstylePizzaStore;
import com.example.demo.factory.store.Pizza;
import com.example.demo.factory.store.PizzaStore;

public class FactoryApplication {

  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYstylePizzaStore();
    Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
    System.out.println("A가 주문한 " + pizza1.getName() + "\n\n");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
    System.out.println("B가 주문한 " + pizza2.getName() + "\n\n");

  }
}
