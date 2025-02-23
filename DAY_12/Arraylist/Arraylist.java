
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList<>();
        aList.add(1);
        aList.add("hi");
        aList.add(0.3);
        aList.add('A');
        aList.add("bun");
        aList.add(99);
        aList.add('D');
        aList.add(100.0);
        System.out.println(aList);
        aList.remove("hi"); //removes string "hi"
        System.out.println(aList);
        aList.remove(1); //removes index 1 ie 0.3
        System.out.println(aList);
        aList.remove((Object) 1); //removes the object 1
        System.out.println(aList);
        
        ArrayList aList2 = ( ArrayList) aList.clone();
            System.out.println(aList.get(0));
            System.out.println(aList.get(4));
    }
}
