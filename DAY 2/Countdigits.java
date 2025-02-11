//Write a java program to count the digits in the number
import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count+ " digits are present ");
        sc.close();
    }
}
