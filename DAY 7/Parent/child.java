
public class child extends Parent {
    {
        System.out.println("Child  non static");
    }
    public static void main(String[] args) {
        child c = new child();           // the child class constructor will have the default super(); statement which
                                        // will  call the parent class constructor , the parent consructor will load the 
                                        // non static members to the object created in the child class 
    }
}
