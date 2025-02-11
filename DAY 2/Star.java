/*  Write a Java program to print 
 *  *  *  * 
 *  *  *  *
 *  *  *  *
 *  *  *  *
  */

import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the Columns: ");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}
