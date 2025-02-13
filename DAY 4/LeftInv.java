// Write a Java Program to print the * pattern in the Left Inverted Triangle.
// * * * *
//  * * *
//  * *
//  *

import java.util.Scanner;

public class LeftInv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <=num; j++) {
                    if (i+j <= num+1) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
        }
        sc.close();
    }
}
