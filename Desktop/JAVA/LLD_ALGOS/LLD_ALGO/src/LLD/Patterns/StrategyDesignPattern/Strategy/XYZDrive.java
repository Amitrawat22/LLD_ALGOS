package LLD.Patterns.StrategyDesignPattern.Strategy;

public class XYZDrive implements DriveStrats{
    @Override
    public void drive() {
        System.out.println("xyz drive capability");
    }
}
