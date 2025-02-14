// Write a java program to Swap 2 numbers
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Num 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Num 2 : ");
            int num2 = sc.nextInt();
            sc.close();
            int temp = num1;
            num1 = num2;
            num2 = temp;
        System.out.println(num1 + " num1 , "+ num2+" num2");
    }
}

// without temp variable
// num1 = num1+num2;
// num2 = num1-num2;
// num1 = num1- num2;
