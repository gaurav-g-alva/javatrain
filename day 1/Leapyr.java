//Write a java program to find the Leap Year

import java.util.Scanner;
public class Leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if ((year%4==0 && year%100!=0)||year%400==0) {
            System.out.println( year +" is a Leapyear");
        }
        else{
            System.out.println( year +" is Not leapyear");
        }
    }
}
