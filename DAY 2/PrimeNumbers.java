//Write a Java Program to find the Prime numbers
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=2;
        for (int i = 2; i<=num/2; i++) {
            if (num %i==0) {  
                count++;
            }
        }
        if (count==2) {
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
        sc.close();
    }
}
