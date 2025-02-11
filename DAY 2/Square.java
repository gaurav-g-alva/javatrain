//Find the Square of number between the range

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Start: ");
        int start = sc.nextInt();
        System.out.print("Enter the End: ");
        int end = sc.nextInt();
        for (int i = start; i <=end; i++){
            System.out.println("Square of "+ i+" is "+i*i);
        }
        sc.close();
    }
}

