// Write a java program to print the pattern of numbers
// 1 
// 2 2 
// 1 2 3 
// 4 4 4 4

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                
                if (i>=j) {
                    if(i%2==0){
                     System.out.print(i + " ");
                    }
                  else {
                     System.out.print(j+ " ");
                    }
                }   
            }
            System.out.println();
            sc.close();
        } 
    }
}
