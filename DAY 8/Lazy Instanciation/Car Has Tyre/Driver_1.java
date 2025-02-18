public class Driver_1 {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        // System.out.println(car.company);
        car.attachTyre("Apollo");
        // System.out.println(car.tyres[0].brand);
        car.attachTyre("mrf");
        car.attachTyre("TVS");
        car.attachTyre("CEAT");
        for (int i = 0; i < 4; i++) {
            System.out.println(car.tyres[i].brand);
        }
        
    }
}
