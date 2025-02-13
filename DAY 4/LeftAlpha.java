//Write a java program to Print the Alphabets in triangle
// A    
// B C   
// D E F  
// G H I J
import java.util.Scanner;

public class LeftAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        char a = 'A';
        sc.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i>=j) {
                    System.out.print(a++ + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    } 
}
