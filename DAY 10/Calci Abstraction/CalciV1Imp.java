
public class CalciV1Imp extends CalciV1{
    public int power(int m,int n){
        if (n == 0)
            return 1;
        else
            return m * power(m, n - 1);
    }
    public int square(int a){
        return a*a;
    }

    //basicCalci

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return b-a;
    }

    public int mul(int a,int b){
        return a*b;
    }
}
