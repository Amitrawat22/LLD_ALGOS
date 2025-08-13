package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.StrategyDesignPattern.Strategy.DriveStrats;
import LLD.Patterns.StrategyDesignPattern.Strategy.XYZDrive;

public class Offroad extends vehicle{
    Offroad() {
        super(new XYZDrive());
    }

}
