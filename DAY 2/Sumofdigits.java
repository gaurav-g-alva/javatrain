//Write a java program to find the Sum of the Digits.

import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        System.out.println(sum+ " sum of digits ");
        sc.close();
    }
}
