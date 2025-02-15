//Write a Java Program to Add to 3 x 3 Matrix in 2D array
import java.util.Scanner;
public class Add2DArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr1 = new int[3][3];
            int[][] arr2 = new int[3][3];
            int[][] sum = new int[3][3];
            System.out.println("Enter the Elements of 1  :");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the Elements  of 2 :");
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    arr2[k][l] = sc.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
}
