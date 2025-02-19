
public class Driver {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", 20000, new Cpu("Intel", 6004));
        System.out.println(computer.brand);
        System.out.println(computer.price);
        System.out.println(computer.getCpu()); //address
        System.out.println(computer.getCpu().systemName); 
        System.out.println(computer.getCpu().cpuId); 

        Cpu c1 = new Cpu("ASUS", 5004);
        c1.cpuDetails();

        Computer s1 = new Computer("jio", 15000, c1);
        s1.computerDetails();

    }
}
