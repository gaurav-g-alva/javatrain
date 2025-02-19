// Method overloading program to add the numbers
public class Calci {
    private int  add(int  i, int j) {
        return  i+j;
    }

    private int  add(int  i, int j,int k) {
        return  i+j+k;
    }
    public static void main(String[] args) {
        Calci a = new Calci();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20,30));
            }
}
