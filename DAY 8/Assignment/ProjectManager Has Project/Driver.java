
public class Driver {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager("Gaurav", 20011, new Project("Student System", "B6002"));
        System.out.println(manager.name);
        System.out.println(manager.empId);
        System.out.println(manager.getProject()); //address
        System.out.println(manager.getProject().projectName); 
        System.out.println(manager.getProject().projectId); 

        Project p1 = new Project("School system", "C6003");
        p1.projectDetails();

        ProjectManager m1 = new ProjectManager("Saurav", 20014, p1);
        m1.personDetails();

    }
}
