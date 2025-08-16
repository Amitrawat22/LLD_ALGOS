package LLD.Patterns.StrategyDesignPattern.Strategy;

public class normal implements DriveStrats {
    @Override
    public void drive() {
        System.out.println("simple Drive");
    }
}
