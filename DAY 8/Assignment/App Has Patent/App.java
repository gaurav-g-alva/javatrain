
public class App {
    String Name;
    int size;
    private Patent patent;

    public App(String Name,int size,Patent patent) {
        this.Name = Name;
        this.size = size;
        this.patent = patent;
    }
    public Patent getpatent(){
        return patent;
    }
    public void showPatent(){
        System.out.println("\nApp Name : "+Name+"\nSize : " + size+" MB");
        patent.patentDetails();
    }
}
