
public class Project {
     String projectName;
     String projectId;

    public Project(String projectName,String projectId) {
        this.projectName =projectName;
        this.projectId =projectId;
    }
    
    public void projectDetails() {
        System.out.println("\nProject Name: " + projectName+ "\nProject Id : "+projectId);
    }
}
