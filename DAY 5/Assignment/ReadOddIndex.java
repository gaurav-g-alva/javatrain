// Read only odd indexed elements from an array
import java.util.Scanner;

public class ReadOddIndex {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    int sum=0;
    System.out.println("Array Length : "+ arr.length);
    for (int i = 1; i < arr.length; i+=2) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= scanner.nextInt();
    }
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
    scanner.close();
   } 
}
