//Write a java Program to print the Zero and One
// 1 1 1 1 
// 0 0 0 
// 1 1 
// 0 
import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <=num; j++) {
                    if (i+j<=num+1) {
                    if (i % 2 == 0) {
                        System.out.print(0+" ");
                    } else {
                        System.out.print(1+" ");
                    }
                }
            }
                System.out.println();
        }
    
        sc.close();
    }
}
