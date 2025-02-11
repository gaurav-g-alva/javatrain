/*Write a Java program to print the numbers 
1 2 3 4 
5 6 7 8
9 10 11 12
13 14 15 16
*/

//import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the Columns: ");
        int n = sc.nextInt();*/
        int m=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
            
        }
        //sc.close();
    }
}
