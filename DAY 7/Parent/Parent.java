public class Parent {
    // static block 
    static {
        System.out.println("Parent static");
    }
    //non static block
    {
        System.out.println("Parent non static");  // the parent class constructor will be called by the super(); statement
                                                    // the parent class construtor loads the non static member of parent class 
                                                    // to the object created
        
    }
}
