//Write a Java Program to Search an elemen in the array usin Binary Search
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the value for Index : "+ i);
        arr[i]= scanner.nextInt();
    }
    System.out.println("Enter the number to search :");
    int num = scanner.nextInt();
    boolean flag = false;
    int low = 0;
    int high = arr.length-1;
    while(low <= high){
        int mid= (low+ high)/2;
        if(num==arr[mid]){
            System.out.println(num +" is found in index "+mid);
            flag = true;
            break;
        } else if(num < arr[mid]){
            high =  mid-1;
        } else{
            low = mid +1;
        }
    }
    if (flag == false) {
        System.out.println(num +" is not found ");
    }
}
}
