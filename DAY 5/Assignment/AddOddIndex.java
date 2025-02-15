//Find out the sum of all odd indexed elements from a given int array

import java.util.Scanner;

public class AddOddIndex {
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
    }
    for (int i = 0; i < size; i++) {
        if(i%2 !=0){
        System.out.print(arr[i] + " ");
        sum = sum + arr[i];
    }
    }
    System.out.println("\nSum of odd index elements : "+sum);
    scanner.close();
   }
}
