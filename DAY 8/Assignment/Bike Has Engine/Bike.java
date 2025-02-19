
public class Bike {
    String model;
    int year;
    private Engine engine;

    public Bike(String model,int year,Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    public Engine getEngine(){
        return engine;
    }
    public void bikeDetails(){
        System.out.println("Bike model : "+model+"\nYear : " + year);
    }
}
