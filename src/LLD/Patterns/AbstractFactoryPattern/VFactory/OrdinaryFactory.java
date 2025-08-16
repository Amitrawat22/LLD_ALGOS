package LLD.Patterns.AbstractFactoryPattern.VFactory;

import LLD.Patterns.AbstractFactoryPattern.VehicleName.Honda;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.Hyundai;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.VVehicle;
import LLD.Patterns.LiskovP.Vehicle;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public VVehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("Hyundai")) {
            return new Hyundai();
        }else if(vehicleType.equalsIgnoreCase("Honda")){
            return new Honda();
        }
        return null;
    }
}
