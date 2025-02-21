// Write a java program to Remove the occurance of Elements in an Array
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Array Length : "+ arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for Index : "+ i);
            arr[i]= sc.nextInt();
        }

        System.out.println("enter value to be removed : ");
        int n = sc.nextInt();

        int j=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=n){
            arr[j++] =arr[i];
           } 
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
