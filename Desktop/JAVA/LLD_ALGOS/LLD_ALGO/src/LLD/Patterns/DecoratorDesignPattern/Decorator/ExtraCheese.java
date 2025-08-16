package LLD.Patterns.DecoratorDesignPattern.Decorator;

import LLD.Patterns.DecoratorDesignPattern.Base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        //extra cheese cost 30 ruppes
        return this.basePizza.cost() + 30;
    }
}
