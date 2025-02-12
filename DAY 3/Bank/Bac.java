

public class Bac {
    private String name;
    private int bankacc;
    private int balance;
    private int pin;

    public Bac(String name, int bankacc , int balance, int pin){
        this.name= name;
        this.bankacc= bankacc;
        this.balance= balance;
        this.pin= pin;
    }

    public String getname(int pin){
        if(verifypin(pin)){
                    return name;
                }else {
                    
                    return "Invalid Pass";
                }
            }
        
    private boolean verifypin(int pin) {
                return this.pin==pin;
    }
}
