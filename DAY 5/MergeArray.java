//Write a java Program to Merge Two Arrays

public class MergeArray {
    public static void main(String[] args) {
        int[] a = {4,3,6,5};
        int[] b = {10,12,15};
        int[] c = new int[a.length+b.length];
        // for (int i = 0; i < a.length; i++){
        //     c[i] = a[i];
        // }
        // for (int i = 0; i < b.length; i++){
        //     c[a.length+i] = b[i];
        // }
        int indx1 = a.length-1;
        int indx2 = b.length-1;
        for (int i = 0; i < c.length; i++){
            if(indx1 >= 0) {
                c[i] = a[indx1--];
            } else {
                c[i] = b[indx2--];
            }
        }
        System.out.println("Merged Array : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] +" ");
        }
    }
}
