//Write a java program to know the profit and loss of the shop using cost price & selling price

import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost : ");
        int cost = sc.nextInt();
        System.out.print("Enter the Selling price : ");
        int Sp = sc.nextInt();
        if(Sp>cost)
        {
            System.out.println(Sp-cost+"rs  profit " );
        }
        else if(cost>Sp)
        {
            System.out.println(Sp-cost+"rs loss  ");
        }
        else
        {
            System.out.println("No Profit , No Loss");
        }
        sc.close();
    }
}
