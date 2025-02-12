
public class BankDriv {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc();
        b1.setName("Jay");
        System.out.println(b1.getName());
        
        b1.setAccNo(12565);
        System.out.println(b1.getAccNo());
        
        b1.setBankName("AXIS");
        
        BankAcc b2 = new BankAcc();
        System.out.println(b2.getBankName());
    }

    
}
