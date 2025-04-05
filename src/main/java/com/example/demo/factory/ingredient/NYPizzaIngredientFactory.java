package com.example.demo.factory.ingredient;

import com.example.demo.factory.ingredient.concreate.FreshClams;
import com.example.demo.factory.ingredient.concreate.Galic;
import com.example.demo.factory.ingredient.concreate.MarinaraSauce;
import com.example.demo.factory.ingredient.concreate.Mushroom;
import com.example.demo.factory.ingredient.concreate.Onion;
import com.example.demo.factory.ingredient.concreate.Pepperoni;
import com.example.demo.factory.ingredient.concreate.RedPepper;
import com.example.demo.factory.ingredient.concreate.ReggianoCheese;
import com.example.demo.factory.ingredient.concreate.SlicedPepperoni;
import com.example.demo.factory.ingredient.concreate.ThinCrustDough;
import com.example.demo.factory.ingredient.inter.Cheese;
import com.example.demo.factory.ingredient.inter.Clams;
import com.example.demo.factory.ingredient.inter.Dough;
import com.example.demo.factory.ingredient.inter.Sauce;
import com.example.demo.factory.ingredient.inter.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[] { new Galic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClams();
  }
}
