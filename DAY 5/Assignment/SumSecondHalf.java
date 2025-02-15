// Find out the sum of all elements from a second half of given int array
import java.util.Scanner;

public class SumSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum=0;
        System.out.println("Array Length : "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= sc.nextInt();
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.print(arr[i] +" ");
        }
            System.out.println("\nSum of Second Half of array is : "+sum);
    }
}
