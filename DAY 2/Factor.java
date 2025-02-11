//Write the java program to find the Factor of the Given number 

import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++) {
            if (num %i==0) {
                System.out.println(i+" is a factor of "+num);   
            }
        } 
        sc.close();
    }
    

}
