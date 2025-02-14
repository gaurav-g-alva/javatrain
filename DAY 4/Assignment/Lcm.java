import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Num 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Num 2 : ");
            int num2 = sc.nextInt();
            sc.close();
            int res = findLCM(num1, num2);
            System.out.println("LCM is " +res );
    }
    public static int findLCM(int num1, int num2) {
        int large = (num1 > num2)?num1 : num2;
        while (true) {
            if (large%num1 == 0 && large%num2 == 0) {
                return large;
            }
            large++;
        }
    }
}
