package com.example.demo.decorator;

import com.example.demo.decorator.Beverage.SizeEnum;
import com.example.demo.decorator.componentDecorator.Mocha;
import com.example.demo.decorator.componentDecorator.Soy;
import com.example.demo.decorator.componentDecorator.Whip;

public class DecoratorApplication {

  public static void main(String[] args) {

    Beverage menu = new Espresso();
    System.out.println(menu);

    Beverage menu2 = new DarkRoast();
    menu2 = new Mocha(menu2);
    menu2 = new Mocha(menu2);
    menu2 = new Whip(menu2);
    menu2.setSize(SizeEnum.GRANDE);
    System.out.println(menu2);

    Beverage menu3 = new HouseBlend();
    menu3 = new Soy(menu3);
    menu3 = new Mocha(menu3);
    menu3 = new Whip(menu3);
    menu3.setSize(SizeEnum.VENTI);
    System.out.println(menu3);

  }
}
