
public class Child extends Parent {
    public static void greet() {
        System.out.println(" Welcome ");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.greet();

        Child.greet();

        Parent p = new Child();
        p.greet();

        Parent.greet();
    }
}
