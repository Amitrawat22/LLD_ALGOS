package LLD.Patterns.DecoratorDesignPattern;

import LLD.Patterns.DecoratorDesignPattern.Base.BasePizza;
import LLD.Patterns.DecoratorDesignPattern.Base.Farmhouse;
import LLD.Patterns.DecoratorDesignPattern.Base.Margerrita;
import LLD.Patterns.DecoratorDesignPattern.Decorator.ExtraCheese;
import LLD.Patterns.DecoratorDesignPattern.Decorator.Jalepino;
import LLD.Patterns.DecoratorDesignPattern.Decorator.ToppingDecorator;

public class main {
    public static void main(String[] args) {
//        BasePizza pizza1 = new Farmhouse();
//        BasePizza pizza2 = new Margerrita();
//
//        ToppingDecorator tp1 = new ExtraCheese(pizza2);
//        ToppingDecorator tp2 = new Jalepino(pizza1);
//
//
//        System.out.println("cost of farmhouse pizza "+ pizza1.cost() + " "+ " cost with jalepino "+ tp2.cost());
//        System.out.println("cost of Margerrita pizza "+ pizza2.cost() + " "+ " cost with extracheese "+ tp1.cost());
        BasePizza pizza = new ExtraCheese(new Farmhouse());
        System.out.println(pizza.cost());

        BasePizza pizza2 = new ExtraCheese(new Jalepino(new Margerrita()));
        System.out.println(pizza2.cost());

    }
}
