package LLD.Patterns.LiskovP;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstituion {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new cycle());
        vehicleList.add(new car());
        vehicleList.add(new bike());

        for(Vehicle vehicle : vehicleList){
            System.out.println("Total Tyres  "+ vehicle.getClass().getSimpleName()+ " " +vehicle.getTyreN() );
            if(vehicle instanceof Engine ev){
                System.out.println("Engine :"+ " "+ ev.hasEngine());
            }
        }

    }
}
