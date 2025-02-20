
//Write a java program to find if the String is Anagram or not
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String : ");
        String s1 = sc.next();
        System.out.println("Enter 2nd String : ");
        String s2 = sc.next();
        if(isAnagrams(s1, s2) == true){
            System.out.println("The String is Anagram");
        } else {
        System.out.println("The String is not Anagram");
    }
     sc.close();             
    }
        static boolean isAnagrams(String s1, String s2) {
            boolean flag = false;
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i = 0; i < c2.length; i++) {
                if(c1[i] == c2[i]){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            return flag;
        }    
}
