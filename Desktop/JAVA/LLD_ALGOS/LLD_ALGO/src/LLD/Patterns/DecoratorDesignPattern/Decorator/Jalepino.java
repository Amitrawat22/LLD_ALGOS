package LLD.Patterns.DecoratorDesignPattern.Decorator;

import LLD.Patterns.DecoratorDesignPattern.Base.BasePizza;

public class Jalepino extends ToppingDecorator{

    BasePizza basePizza;

    public Jalepino(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        //cost for jalepino
        return this.basePizza.cost() + 15;
    }
}
