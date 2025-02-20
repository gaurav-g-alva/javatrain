
public class Driver {
    Team team1 = new Team("Ranger", "School Sys", 25, new TeamLead("Gaurav", 4521));
        System.out.println(team1.teamName);
        System.out.println(team1.year);
        System.out.println(team1.numMembers);
        System.out.println(team1.projectName);
        System.out.println(team1.getteamLead());
        System.out.println(team1.getteamLead().Name);
        System.out.println(team1.getteamLead().empId);


        TeamLead t1 = new TeamLead("Saurav", 4256);
        t1.teamLeadDetails();

        Team t = new Team("Rover", "BAnk Sys", 13, t1);
        t.teamDetails();
}
