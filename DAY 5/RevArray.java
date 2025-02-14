// Write java program to reverse the array elements using swapping of elements
import java.util.Scanner;
public class RevArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for Index : "+ i);
            arr[i]= scanner.nextInt();
        }
        // for (int i = 0; i < arr.length/2; i++) {
        //     int temp = arr[i];
        //     arr[i]=arr[size-1-i];
        //     arr[size-1-i]= temp;
        // }
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println("Resverse Array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        scanner.close();
       } 
}

