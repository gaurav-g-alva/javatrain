//Sum of Even numbers form the given start to end numbers

import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int n = sc.nextInt();
        System.out.print("Enter the end number: ");
        int m = sc.nextInt();
            int sum =0;
        for (int i = n; i <=m; i++) {
            if (i%2==0) {
                sum = sum + i;  
            }
        }
            System.out.println( sum +" : sum of even  numbers");
            
        sc.close();
    }
}
