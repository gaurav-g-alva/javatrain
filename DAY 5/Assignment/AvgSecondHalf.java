// Find out the avg value from a second half of given int array
import java.util.Scanner;

public class AvgSecondHalf {
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
    System.out.println("\nSum of second half of elements : "+ add(arr));
    double avg = add(arr) / (size - size/2);
    System.out.println("\nAvg of second half of elements : "+ avg);
    scanner.close();
   }
   public static int add(int[] arr){
    int sum=0;
    for (int i = arr.length/2; i < arr.length; i++) {
        sum =sum + arr[i];
    }
    return sum;
}
}
