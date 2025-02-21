//Write a java program to print the Stars in Diamond Shape
import java.util.Scanner;
public class Pattern {
    public static void main(String args[]) {

        int n;
        int space = 1;
        
        System.out.print("Enter the value : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
                space--;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
                space++;
            for (int j = 1; j <= 2*(n-i)-1; j++) {
                System.out.print("*"); 
            }
            System.out.println(""); 
        }
    }
}
