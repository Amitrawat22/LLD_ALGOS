package LLD.Patterns.AbstractFactoryPattern.FactoryProducer;

import LLD.Patterns.AbstractFactoryPattern.VFactory.LuxuryFactory;
import LLD.Patterns.AbstractFactoryPattern.VFactory.OrdinaryFactory;
import LLD.Patterns.AbstractFactoryPattern.VFactory.VehicleFactory;

public class FactoryProducer {
    public static VehicleFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Ordinary")) {
            return new OrdinaryFactory();
        } else if (choice.equalsIgnoreCase("Luxury")) {
            return new LuxuryFactory();
        }
        return null;
    }
}
