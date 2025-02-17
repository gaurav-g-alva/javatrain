
public class Driver {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.brand = "nokia";
        s1.price = 1200;
        s1.displaySmartPhoneDetails();

        SmartPhone p1 = new SmartPhone();
        p1.brand = "MI";
        p1.price = 12000;
        p1.cameraQuality = 20;
        p1.operatingSystem = "Android";
        p1.displaySmartPhoneDetails();
    }
    
}
