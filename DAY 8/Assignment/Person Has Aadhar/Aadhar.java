
public class Aadhar {
     long aadharNum;
     String address;

    public Aadhar(long aadharNum,String address) {
        this.aadharNum =aadharNum;
        this.address =address;
    }
    
    public void aadharDetails() {
        System.out.println("\nAadhar Number: " + aadharNum+ "\nAddress : "+address);
    }
}
