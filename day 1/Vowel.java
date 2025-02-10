// Write a java programm to check the given input character is vowel or consonant
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        a=Character.toLowerCase(a);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println(a+" is vowel");
                
                break;
        
            default:System.out.println(a+ " is consonant");
                break;
        }
    }
}
/*
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
    System.out.println(a+" is vowel");
}
else
{
    System.out.println(a+" is consonant");
}
 */