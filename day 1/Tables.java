

import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        //Multiplication table of numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n + " x "+ i +" = " + n*i);   
        }
        
        //Print the Even Numbers
        for (int i = 1; i <=10; i++) {
            if (i%2==0) {
                System.out.println( i );
            }
        }
        
        // Print Sum of Odd numbers from 1-10
        int sum =0;
        for (int i = 1; i <=10; i++) {
            if (i%2!=0) {
                sum = sum + i;  
            }
        }
            System.out.println( sum +" : sum of odd numbers 1-10");
        sc.close(); 
    }
}
