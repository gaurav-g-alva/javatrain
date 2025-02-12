import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isStrongNumber(num)) {
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number");
        }
        sc.close();
    }

    // Strong Number Method 
    public static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNumber;    //returns boolean value
    }

    //Factorial Method 
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
