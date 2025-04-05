package com.example.demo.factory.ingredient;

import com.example.demo.factory.ingredient.concreate.Pepperoni;
import com.example.demo.factory.ingredient.concreate.SlicedPepperoni;
import com.example.demo.factory.ingredient.inter.Cheese;
import com.example.demo.factory.ingredient.inter.Clams;
import com.example.demo.factory.ingredient.inter.Dough;
import com.example.demo.factory.ingredient.inter.Sauce;
import com.example.demo.factory.ingredient.inter.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[] {new Spinach(), new BlackOlives(), new EggPlant()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FrozenClams();
  }
}
