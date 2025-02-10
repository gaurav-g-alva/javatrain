//Check Number of notes required

import java.util.Scanner;
public class Currency {
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Currency: ");
        int a = sc.nextInt();
         int c = a%500;
         System.out.println("500 note : "+a/500);
         int d = c%200;
         System.out.println("200 note : "+c/200);
         int e = d%100;
         System.out.println("100 note : "+d/100);
         int f = e%50;
         System.out.println("50 note : "+e/50);
        
    }*/

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Currency: ");
  int amt = sc.nextInt();
  if(amt>=500)
  {
       int notes = amt/500;
       System.out.println("500 note : "+ notes);
       amt = amt%500;
  }
  if(amt>=200)
  {
       int notes = amt/200;
       System.out.println("200 note : "+ notes);
       amt = amt%200;
  }
  if(amt>=100)
  {
       int notes = amt/100;
       System.out.println("100 note : "+ notes);
       amt = amt%100;
  }
  if(amt>=50)
  {
       int notes = amt/50;
       System.out.println("50 note : "+ notes);
       amt = amt%50;
  }
  sc.close();
}
}
