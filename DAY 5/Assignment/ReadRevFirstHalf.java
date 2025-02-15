// Read first half of the elements in the reverse direction from an array

import java.util.Scanner;

public class ReadRevFirstHalf {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    int[] rev = new int[size];
    System.out.println("Array Length : "+ arr.length);
    for (int i = 0; i < arr.length/2; i++) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= scanner.nextInt();
    }
    System.out.println("Reverse order : ");
    for (int i = 0; i < arr.length/2; i++) {
        rev[i]= arr[(size/2)-1-i];
        System.out.print(rev[i]+" ");
    }
}
}
