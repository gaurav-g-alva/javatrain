
public class Driver {
    public static void main(String[] args) {
        App app = new App("google", 400, new Patent("Sundar Pichai", 40121));
        System.out.println(app.Name);
        System.out.println(app.size);
        System.out.println(app.getpatent()); //address
        System.out.println(app.getpatent().ownerShip); 
        System.out.println(app.getpatent().patentNum); 

        Patent p1 = new Patent("Gaurav", 95623);
        p1.patentDetails();

        App a1 = new App("PatrSrijan", 100, p1);
        a1.showPatent();

    }
}
