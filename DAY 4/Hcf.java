import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Num 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Num 2 : ");
            int num2 = sc.nextInt();
            sc.close();
            if (num1 == num2) {
                System.out.println(num1+ " is HCF");
            } else {
            int large = num1>num2?num1:num2;
            for (int i = large/2; i >=1; i--) {
                if (num1 % i ==0 && num2 % i ==0) {
                    System.out.println(i+ " is HCF");
                    break;
                }
            }
        }
        sc.close();
    }
    
}

    