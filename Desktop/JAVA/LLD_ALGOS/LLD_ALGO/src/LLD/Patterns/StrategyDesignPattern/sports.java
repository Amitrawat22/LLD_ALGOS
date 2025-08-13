package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.StrategyDesignPattern.Strategy.DriveStrats;
import LLD.Patterns.StrategyDesignPattern.Strategy.Sports;

public class sports extends vehicle{
    sports() {
        super(new Sports());
    }
}
