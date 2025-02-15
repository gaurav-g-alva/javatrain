// Read second half of the elements in the reverse direction from an array

import java.util.Scanner;

public class ReadRevSecondHalf {
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
    System.out.println("Reverse order : ");
    int[] rev = new int[size - size/2];
    for (int i = 0; i < size - size/2 ; i++) {
        rev[i]= arr[arr.length-1-i];
        System.out.print(rev[i]+" ");
    }
}
}
