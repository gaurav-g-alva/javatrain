//Find out the min value from all even indexed elements from a given int array

import java.util.Scanner;

public class MinEvenIndex {
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
    int min =arr[1];
    for (int i = 0; i < size; i++) {
        if(i%2==0 && arr[i] < min){
        min = arr[i];
    }
    }
    System.out.println("Min of Even index of elements is : "+min);
    scanner.close();
   } 
}
