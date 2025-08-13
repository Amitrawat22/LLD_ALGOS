package LLD.Patterns.DecoratorDesignPattern.Decorator;

import LLD.Patterns.DecoratorDesignPattern.Base.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    @Override
    public int cost() {
        return 0;
    }
}
