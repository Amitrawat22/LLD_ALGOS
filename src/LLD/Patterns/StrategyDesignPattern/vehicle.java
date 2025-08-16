package LLD.Patterns.StrategyDesignPattern;

import LLD.Patterns.StrategyDesignPattern.Strategy.DriveStrats;

public class vehicle implements DriveStrats {
    DriveStrats driveObj;

    vehicle(DriveStrats Obj){
        this.driveObj = Obj;
    }

    public void drive(){
        driveObj.drive();
    }

}
