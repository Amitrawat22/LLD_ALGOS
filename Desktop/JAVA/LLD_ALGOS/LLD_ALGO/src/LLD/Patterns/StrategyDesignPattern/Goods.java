package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.StrategyDesignPattern.Strategy.DriveStrats;
import LLD.Patterns.StrategyDesignPattern.Strategy.XYZDrive;

public class Goods extends vehicle{
    Goods() {
        super(new XYZDrive());
    }
}
