
public class ProjectManager {
    String name;
    int empId;
    private Project project;

    public ProjectManager(String name,int empId,Project project){
        this.name =name;
        this.empId =empId;
        this.project = project;
    }
    public Project getProject(){
        return project;
    }
    public void  personDetails(){
        System.out.println("\nName :"+name+"\nEmp ID : "+empId);
        project.projectDetails();
    }
}
