package com.example.demo.factory.ingredient;

import com.example.demo.factory.ingredient.concreate.Pepperoni;
import com.example.demo.factory.ingredient.inter.Cheese;
import com.example.demo.factory.ingredient.inter.Clams;
import com.example.demo.factory.ingredient.inter.Dough;
import com.example.demo.factory.ingredient.inter.Sauce;
import com.example.demo.factory.ingredient.inter.Veggies;

public interface PizzaIngredientFactory {

  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClam();
}
