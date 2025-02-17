// Write a java program to check the character is Uppercase or Lowercase

import java.util.Scanner;
public class ULCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') //Lowercase Letters (a-z): ASCII values 97 to 122
            {
                System.out.println(ch+ " is LOWERCASE");
            }
            else if (ch >= 'A' && ch <= 'Z') //Uppercase Letters (A-Z): ASCII values 65 to 90
            {
                System.out.println(ch +" is UPPERCASE");
            }
            else
            {
                System.out.println(ch +" is Invalid input");
            } 
            sc.close();
    }
    
}
