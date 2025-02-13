// Write a Java Program to Find the Fibonacci Series

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int n1= 0;
            int n2= 1;
            int n3;
            sc.close();
            System.out.print(n1+" "+n2+" " );
            for (int i = 0; i <= num; i++) {
                n3 = n1+ n2;
                System.out.print(n3+" " );
                n1 = n2;
                n2 = n3;
        }
        sc.close();
    }

}

