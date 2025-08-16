package LLD.Patterns.AbstractFactoryPattern.VFactory;

import LLD.Patterns.AbstractFactoryPattern.VehicleName.Hyundai;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.VVehicle;
import LLD.Patterns.LiskovP.Vehicle;

public interface VehicleFactory {
     VVehicle getVehicle(String vehicleType);
}
