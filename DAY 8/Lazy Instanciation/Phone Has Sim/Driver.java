
public class Driver {
    public static void main(String[] args) {
        Phone ph = new Phone("SAMSUNG");
        System.out.println(ph.brand);
        ph.makeCall("idea",98734567);
        System.out.println(ph.sim);
        System.out.println(ph.sim.company);
        System.out.println(ph.sim.phone);
    }
}
