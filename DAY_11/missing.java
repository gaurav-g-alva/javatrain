// Write a java program to find the missing number in an Array , Given with minimum and maximum range
public class missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int min = 1;
        int max =6;
        System.out.println("Array Length : "+ arr.length);
        
            int res = min;
            int arres =0;
        for (int i = 0; i < arr.length; i++) {
            min++;
           res = res + min;
           arres += arr[i];
        }
        if(res==arres){
            System.out.println("no missing numbers");
        } else {
            res = res - arres;
            System.out.println("missing number is : "+ res);
        }
    }
}
