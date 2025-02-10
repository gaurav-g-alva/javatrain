// Write a java program to check the character is Uppercase or Lowercase

import java.util.Scanner;
public class ULCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println(a+ " is LOWERCASE");
            
        }
        else
        {
            System.out.println(a +" is UPPERCASE");
        }
    }
    
}
