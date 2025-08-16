package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.StrategyDesignPattern.Strategy.DriveStrats;
import LLD.Patterns.StrategyDesignPattern.Strategy.XYZDrive;
import LLD.Patterns.StrategyDesignPattern.Strategy.normal;

public class Passenger extends vehicle{

    Passenger() {
        super(new normal());
    }
}
