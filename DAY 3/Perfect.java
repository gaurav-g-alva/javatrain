//Write a java Program to Check if the given number is perfect number or not

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPerfect(num)) 
        {
            System.out.println(num+" is Perfect "); 
        }
        else
        {
            System.out.println(num+" not Perfect ");
        }
        
        sc.close();
    }
    public static boolean isPerfect(int num){
        int sum=0;
        for (int i = 1; i<=num/2; i++) {
            if (num %i==0) {
                     sum += i;  
            }
        }
        return num==sum;
    }
}
