
public class Driver {
    public static void main(String[] args) {
        Mobile mb = new Mobile("SAMSUNG", 16, 15000, new Battery("Li ion", 6000));
        System.out.println(mb.brand);
        System.out.println(mb.ram);
        System.out.println(mb.price);
        System.out.println(mb.getBattery());
        System.out.println(mb.getBattery().type); 
        System.out.println(mb.getBattery().batteryCapacity); 

        Battery b1 = new Battery("li ion", 56000);
        b1.batteryDetails();

        Mobile m1 = new Mobile("MI", 16, 20000, b1);
        m1.mobileDetails();

    }
}
