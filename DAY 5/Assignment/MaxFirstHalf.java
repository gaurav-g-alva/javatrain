//Find out the max value from a first half of given int array

import java.util.Scanner;

public class MaxFirstHalf {
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
    for (int i = 0; i < size/2; i++) {
        if(arr[i] > max){
        max = arr[i];
    }
    }
    System.out.println("Max of First Half is : "+max);
    scanner.close();
   }
}
