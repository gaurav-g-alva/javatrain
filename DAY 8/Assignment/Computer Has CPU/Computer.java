
public class Computer {
    String brand;
    double price;
    private Cpu cpu;

    public Computer(String brand,double  price,Cpu cpu) {
        this.brand = brand;
        this.price = price;
        this.cpu = cpu;
    }
    public Cpu getCpu(){
        return cpu;
    }
    public void computerDetails(){
        System.out.println("\nComp Brand : "+brand+"\nComp price : " + price);
        cpu.cpuDetails();
    }
}
