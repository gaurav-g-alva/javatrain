//Write a java program to Sum the up the elements of array
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int sum=0;
        System.out.println("Array Length : "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for Index : "+ i);
            arr[i]= scanner.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+sum + " is Sum of array Elements");
        scanner.close();
       } 
}
