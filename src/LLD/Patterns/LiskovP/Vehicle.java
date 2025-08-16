package LLD.Patterns.LiskovP;

public class Vehicle {
    private final int tyres;

    Vehicle(int tyre){
        this.tyres = tyre;
    }
    public int getTyreN(){
        return tyres;
    }
}


class Engine extends Vehicle{

    public Engine(int tyres){
        super(tyres);
    }

    public boolean hasEngine(){
        return true;
    }
}
class NonEngine extends Vehicle{
    public NonEngine(int tyres){
        super(tyres);
    }
}

class car extends Engine{
     public car(){
         super(4);
     }
}
class bike extends Engine{
    public bike(){
        super(2);
    }
}
class cycle extends NonEngine{
    public cycle(){
        super(2);
    }
}