//Write the java program to find the count of Factor of a Given number 
import java.util.Scanner;

public class CountFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=0;
        for (int i = 1; i<=num; i++) {
            if (num %i==0) {
                System.out.println(i+" is a factor of "+num);  
                count++;
            }
        }
        System.out.println("There are "+count+ " Factors for "+num); 
        sc.close();
    }
}
