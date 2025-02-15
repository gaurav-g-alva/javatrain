//Write a Java Program to Findthe index of Given Number in an Array


import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr ={5,4,3,1,6,7};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the number to find the pos :");
        int pos = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == pos){
                flag = true;
                System.out.println("pos : "+ i);
                break;
                
            }
        }
        if(flag==false){
            System.out.println("Element not found");
        }
        scanner.close();
       } 
}
