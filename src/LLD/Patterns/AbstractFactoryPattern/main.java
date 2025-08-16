package LLD.Patterns.AbstractFactoryPattern;

import LLD.Patterns.AbstractFactoryPattern.FactoryProducer.FactoryProducer;
import LLD.Patterns.AbstractFactoryPattern.VFactory.VehicleFactory;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.Mercedes;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.VVehicle;
import LLD.Patterns.LiskovP.Vehicle;

public class main {
    public static void main(String[] args) {
        VehicleFactory luxuryFactory = FactoryProducer.getFactory("LUXURY");
        VVehicle bmw = luxuryFactory.getVehicle("BMW");
        bmw.Drive();

        VVehicle mercedes = luxuryFactory.getVehicle("MERCEDES");
        mercedes.Drive();

        // Get an ordinary factory
        VehicleFactory ordinaryFactory = FactoryProducer.getFactory("ORDINARY");
        VVehicle honda = ordinaryFactory.getVehicle("honda");
        honda.Drive();

        VVehicle hyundai = ordinaryFactory.getVehicle("hyundai");
        hyundai.Drive();
    }
}
