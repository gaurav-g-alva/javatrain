//Write a java Program to print the Numbers
// 1 1 1 1 
// 2 2 2   
// 3 3     
// 4

import java.util.Scanner;

public class LeftNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <=num; j++) {
                    if (i+j <= num+1) {
                        System.out.print(i+" ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
        }
        sc.close();
    }
}
