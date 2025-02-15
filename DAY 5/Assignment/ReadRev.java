// Read all elements from an array in the reverse order

import java.util.Scanner;

public class ReadRev {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    int[] rev = new int[size];
    System.out.println("Array Length : "+ arr.length);
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= scanner.nextInt();
    }
    System.out.println("Reverse order : ");
    for (int i = 0; i < arr.length; i++) {
        rev[i]= arr[size-1-i];
        System.out.print(rev[i]+" ");
    }
}
}
