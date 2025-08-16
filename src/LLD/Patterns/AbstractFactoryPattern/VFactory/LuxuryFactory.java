package LLD.Patterns.AbstractFactoryPattern.VFactory;


import LLD.Patterns.AbstractFactoryPattern.VehicleName.BMW;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.Mercedes;
import LLD.Patterns.AbstractFactoryPattern.VehicleName.VVehicle;

import LLD.Patterns.LiskovP.Vehicle;

public class LuxuryFactory implements VehicleFactory{

    @Override
    public VVehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("BMW")){
            return new BMW();
        }else if(vehicleType.equalsIgnoreCase("Mercedes")){
            return new Mercedes();
        }
        return null;
    }
}
