
public class TeamLead {
    String Name;
    int empId;

    public TeamLead(String Name,int empId){
        this.Name =Name;
        this.empId = empId;
    }
    public void teamLeadDetails(){
        System.out.println("TL Name : "+Name+"\nEmp Id : "+empId);
    }
}
