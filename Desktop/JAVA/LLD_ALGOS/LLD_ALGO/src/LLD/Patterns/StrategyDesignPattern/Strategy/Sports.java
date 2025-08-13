package LLD.Patterns.StrategyDesignPattern.Strategy;

public class Sports implements DriveStrats {
    @Override
    public void drive() {
        System.out.println("Special Drive for sports vehicle ");
    }
}
