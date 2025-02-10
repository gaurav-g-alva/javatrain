// check if a number is divisible by 5 & 11
import java.util.Scanner;
public class div511 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println("yes " +a+ " is divisible by 5 & 11");
        }
        else
        {
            System.out.println("no "+a+" is not divisible by 5 & 11");
        }
	}
}

