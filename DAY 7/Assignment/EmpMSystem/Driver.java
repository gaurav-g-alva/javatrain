
public class Driver {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Gaurav";
        e1.age = 21;
        e1.employeeId = 200;
        e1.salary = 120000;
        e1.displayEmployeeDetails();


        e2.name = "Saurav";
        e2.salary = 2000;
        e1.salary = 100000;
        e2.displayEmployeeDetails();
    }
}
