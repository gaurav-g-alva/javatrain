//Write a Java Program to revese the digits of a number

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int Reverse=0;
        while(num!=0){
            int digit = num%10;
            Reverse = Reverse*10+ digit;
            num = num/10;
        }
        System.out.println(Reverse);
        sc.close();
    }
}
