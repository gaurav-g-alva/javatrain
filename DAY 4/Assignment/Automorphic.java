import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            int square = num* num;
            int i = num;
            
            int count=0;
            while(i>0)  
            {  
                count++;   
                i=i/10;  
            }
            int lastNo = square%power(10,count);
            if(num == lastNo)  
                System.out.println(num+ " is an automorphic number.");  
            else  
                System.out.println(num+ " is not an automorphic number.");
        }

        public static int power(int a,int count){
            if (count == 0)
            return 1;
        else
            return a* power(a, count-1);
        }
        
    }
