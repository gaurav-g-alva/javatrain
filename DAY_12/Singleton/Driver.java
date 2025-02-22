
public class Driver {
    public static void main(String[] args) {
        
        Singleton s = Singleton.getSobj();
        Singleton s1 = Singleton.getSobj();
        // Singleton s2 = Singleton.sobj;
        System.out.println(s);      //Singleton@5acf9800
        System.out.println(s1);     //Singleton@5acf9800
        // System.out.println(s2);  //Singleton@5acf9800
    }
}
