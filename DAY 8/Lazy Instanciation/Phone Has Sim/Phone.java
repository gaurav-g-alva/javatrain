


public class Phone {
    String brand;
    Sim sim;

    Phone(String brand){
        this.brand = brand;
    }

    public void makeCall(String company, long phone){
        sim = new Sim(company, phone);
    }
}
