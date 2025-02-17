
public class Employee extends Person {
    static int employeeId;
    static double salary;
    
    public void displayEmployeeDetails() {
        displayPersonalDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
