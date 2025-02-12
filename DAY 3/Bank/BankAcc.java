

public class BankAcc {
    private String name;
    private int accNo;
    private int phone;
    private int pin;
    private int balance;
    private static String bankName;

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAcc.bankName = bankName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
}
}
