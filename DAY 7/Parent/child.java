
public class child extends Parent {
    static {
        System.out.println("Child  non static");
    }
    public static void main(String[] args) {
        child c = new child();
    }
}
