
public class Singleton {
    private Singleton(){

    }
    static Singleton sobj = null;
    public static Singleton getSobj(){
        if(sobj == null){
            sobj = new Singleton();
        }
        return sobj;
    }
}
