
public class Team {
    String teamName;
    String projectName;
    int numMembers;
    private TeamLead teamLead;

    public Team(String teamName,String projectName,int numMembers,TeamLead teamLead) {
        this.teamName = teamName;
        this.projectName = projectName;
        this.numMembers = numMembers;
        this.teamLead = teamLead;
    }
    public TeamLead getteamLead(){
        return teamLead;
    }
    public void teamDetails(){
        System.out.println("Team Name : "+teamName+"\nProject Name : " + projectName+"\nMembers : "+numMembers);
    }
}
