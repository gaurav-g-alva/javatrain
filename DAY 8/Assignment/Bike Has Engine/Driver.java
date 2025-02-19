
public class Driver {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW",2021, new Engine("booster", 210));
        System.out.println(bike.model);
        System.out.println(bike.year);
        System.out.println(bike.getEngine());
        System.out.println(bike.getEngine().topSpeed);
        System.out.println(bike.getEngine().engineType);


        Engine e1 = new Engine("M20", 340);
        e1.engineDetails();

        Bike b1 = new Bike("TVS",2023, e1);
        b1.bikeDetails();
    }
}