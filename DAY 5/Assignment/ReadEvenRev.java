// Read only odd indexed elements from an array in the reverse order
import java.util.Scanner;
public class ReadEvenRev {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Array Length : "+ arr.length);
    for (int i = 0; i < arr.length; i+=2) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= scanner.nextInt();
    }
    int[] rev = new int[size];
    for (int i = 0; i < arr.length; i+=2) {
        rev[i]= arr[(size)-=2];
        System.out.print(rev[i] + " ");
    }
    scanner.close();
   } 
}

