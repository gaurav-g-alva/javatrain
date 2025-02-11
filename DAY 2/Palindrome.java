//Write a Java Program to find the Palindrome of the number

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = reverse(num);
        if (num == rev) {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
        sc.close();
    }

    public static int reverse(int num){
        int Reverse=0;
        while(num!=0){
            int digit = num%10;
            Reverse = Reverse*10+ digit;
            num = num/10;
        }
        return Reverse;
    
    }
}
