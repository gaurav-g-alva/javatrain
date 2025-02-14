import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            if (isHappy(num)) {
                System.out.println(num+ " is a Happy Number");
            } else {
                System.out.println(num+ " is not a Happy Number");
            }
    }
    public static boolean isHappy(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
}
