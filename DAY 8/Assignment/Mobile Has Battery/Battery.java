
public class Battery {
    String type;
     int batteryCapacity;

    public Battery(String type,int batteryCapacity) {
        this.type =type;
        this.batteryCapacity =batteryCapacity;
    }
    
    public void batteryDetails() {
        System.out.println("\nType : " + type+ "\nBattery Capacity : "+batteryCapacity+" Mah");
    }
}
