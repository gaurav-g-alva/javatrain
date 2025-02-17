//Reverse the given number such that second half in first half and first half in second half , only for even inputs
import java.util.Scanner;
public class RevEvenNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int rem = 0;
        int digi = digit(num);
            rem = num % digi;
            int quo = num/digi;
            rem = rem*digi+quo;
            System.out.println("Reverse Number is : "+rem);
                
        }
    public static int digit(int num){
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        } 
        count = count/2;
        return (int) Math.pow(10, count);
    }
}
