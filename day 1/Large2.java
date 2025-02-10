//Write a java program to find the  largest of 2 numbers
import java.util.Scanner;

public class Large2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a>b?a:b;
        System.out.println(c + "is largest");
        sc.close();
    }
}