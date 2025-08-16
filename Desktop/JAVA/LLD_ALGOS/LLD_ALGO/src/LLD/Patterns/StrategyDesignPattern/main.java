package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.LiskovP.Vehicle;

public class main {

    public static void main(String[] args) {
        vehicle vehicle = new sports();
        vehicle.drive();

        vehicle vehicle1 = new Passenger();
        vehicle1.drive();
    }
}
