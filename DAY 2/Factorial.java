// Write a Java Program to Find the Factorial of a number 

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact =1; int i=1;
        while (i<=n) {
            fact = fact *i;
            i++;
        }
        System.out.println(fact +" is factorial of "+ n);
        sc.close();
    }
}

/*
  for(int i=0;i<=n;i++) {
            fact = fact *i;
        }
 */