
public class SmartPhone extends Phone {
    static String operatingSystem;
    static int cameraQuality;
        
        public static void displaySmartPhoneDetails() {
            displayDeviceDetails();
            displayPhoneDetails();
        System.out.println("Operating System : "+ operatingSystem);
        System.out.println("Camera Quality : "+ cameraQuality);
    }
}
