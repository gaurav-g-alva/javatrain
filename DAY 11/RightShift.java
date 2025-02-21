// Write a java program to Right Shift the elements in an Array
public class RightShift {
     public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,79,0};
    System.out.println("Array Length : "+ arr.length);
    
    
    for (int i = 0; i < arr.length; i++) {
       int  temp = arr[i];
        arr[i] = arr[arr.length-1];
        arr[arr.length-1] = temp;
       
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}
