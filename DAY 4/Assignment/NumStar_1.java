//       1
//     1 2 3
//   1 2 3 4 5
// 1 2 3 4 5 6 7
import java.util.Scanner;

public class NumStar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int space= num-1;
        int star=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  "); 
                }
            for (int j = 1; j <= star; j++) {
                System.out.print(j+" "); 
                } 
                System.out.println(); 
                 space--;
                 star = star+2;
            }
            
            sc.close();
        }
}
