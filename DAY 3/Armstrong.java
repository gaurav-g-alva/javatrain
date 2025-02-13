//Write a Java Program to find the ArmStrong Number
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int c = count(num); //Calling Count the Number of Digits method
        int arm = arm(num,c); //Calling Armstrong Number method
        if (num==arm) {
            System.out.println(num+" is a Armstrong number");
        }
        else{
            System.out.println(num+" is not a Armstrong number");
        }
        sc.close();
    }

    //Count the Number of Digits method
    public static int count(int num){
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

    // Armstrong Number method
    public static int arm(int i,int c){
        int sum=0;
        while(i!=0){
            int rem = i %10;
            sum += pow(rem,c); //Calling power method
            i = i/10;   
        }
        return sum;
    }

    //Method to Calculate the Power of nmber
    public static int pow(int rem,int P){
        if (P == 0)
            return 1;
        else
            return rem * pow(rem, P - 1);
    }
    
}
