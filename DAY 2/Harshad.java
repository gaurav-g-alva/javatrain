//Write a Java Program to find if a given number is Harshad number or not

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i= num;
        while(i!=0){
            sum += i % 10;
            i = i/10;
        }
        if (num%sum == 0) {
            System.out.println(num+" is a Harshad number");
        }
        else{
            System.out.println(num+" is not a Harshad number");
        }
        sc.close();
    }
}

/*for (int i = num; i>0; i /=10) {
            sum += i % 10;
        }*/
