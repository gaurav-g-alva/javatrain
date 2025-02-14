//Write the java Program to print the even numbers from an array
import java.util.Scanner;
public class EvenNoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Array Length : "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for Index : "+ i);
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
            System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
       } 
}
