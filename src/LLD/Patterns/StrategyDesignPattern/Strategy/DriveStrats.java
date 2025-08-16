package LLD.Patterns.StrategyDesignPattern.Strategy;

public interface DriveStrats{
    public default void drive(){
        System.out.println("normal drive ");
    }
}
