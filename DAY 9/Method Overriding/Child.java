
public class Child extends Parent {
    public void greet(){
        System.out.println("Welcome ");
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();

        Parent parent = new Child();
        parent.greet();

        // Parent pa = new Parent();
        // pa.greet();

    }
}
