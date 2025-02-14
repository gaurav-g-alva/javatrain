//       A
//     B C D
//   E F G H I
// J K L M N O P
import java.util.Scanner;

public class AlphaStar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        char ch = 'A';
        int space= num-1;
        int star=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  "); 
                }
            for (int j = 1; j <= star; j++) {
                System.out.print(ch++ +" "); 
                } 
                System.out.println(); 
                 space--;
                 star = star+2;
            }
            
            sc.close();
        }
}
