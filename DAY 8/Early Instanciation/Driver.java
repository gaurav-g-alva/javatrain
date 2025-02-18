
public class Driver {
    public static void main(String[] args) {
        Car car = new Car("BMW", new Engine("tata",5000));
        System.out.println(car.brand);
        //System.out.println(car.engine);
        //System.out.println(car.engine.company);
        System.out.println(car.getEngine());
        System.out.println(car.getEngine().company);
    }

}
