//Find out the avg value from all even indexed elements from a given int array
import java.util.Scanner;

public class AvgEvenIndex {
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
    System.out.println("\nSum of Even index elements : "+ add(arr));
    int avg = add(arr) / (arr.length/2);
    System.out.println("\nAvg of Even index elements : "+ avg);
    scanner.close();
   }
   public static int add(int[] arr){
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        if(i%2 ==0){
        System.out.print(arr[i] + " ");
        sum =sum + arr[i];
    }
    }
    return sum;
}
}
