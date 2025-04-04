package com.example.demo.factory.pizza;

import com.example.demo.factory.store.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
  public ChicagoPepperoniPizza() {
    name = "시카고 스타일 소스와 페퍼로니 피자";
    dough = "아주 두꺼운 크러스트 도우";
    sauce = "토마토 소스";

    toppings.add("페퍼로니 햄");
  }
}
