
public class Mobile {
    String brand;
    int ram;
    double price;
    private Battery battery;

    public Mobile(String brand,int ram,double price,Battery battery){
        this.brand =brand;
        this.ram =ram;
        this.price =price;
        this.battery = battery;
    }
    public Battery getBattery(){
        return battery;
    }
    public void  mobileDetails(){
        System.out.println("\nBrand :"+brand+"\nRAM : "+ram);
        battery.batteryDetails();
    }
}
