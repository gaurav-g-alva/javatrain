// Find out the max value from a second half of given int array

import java.util.Scanner;

public class MaxSecondHalf {
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
    int max =arr[1];
    for (int i = size/2; i < size; i++) {
        if(arr[i] > max){
        max = arr[i];
    }
    }
    System.out.println("Max of Second half is : "+max);
    scanner.close();
   }
}
