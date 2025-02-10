//Write a java program to check if the given angle makes a Triangle
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Angles A B and C : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a+b+c==180 && a>0 && b>0 && c>0) {
            System.out.println("It is a Triangle");
        }
        else
        {
            System.out.println("It is not a Triangle");
        }
        sc.close();
    }
}
