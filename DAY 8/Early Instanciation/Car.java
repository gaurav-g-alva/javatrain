
public class Car {
    String brand;
    private Engine engine;

    Car(String brand, Engine engine){
        this.brand= brand;
        this.engine = engine;
    }

    public Engine getEngine(){
        return engine;
    }
}
