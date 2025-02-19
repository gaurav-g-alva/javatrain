
public class Driver {
    public static void main(String[] args) {
        Company company = new Company("Google","Sundar Pichai","x12x1x2",new Gst(74125896));
        System.out.println(company.Name);
        System.out.println(company.ceoName);
        System.out.println(company.Loc);
        System.out.println(company.getGst()); 
        System.out.println(company.getGst().gstNum); 

        Gst g1 = new Gst(74125563);
        g1.gstDetails();

        Company s1 = new Company("Jio", "Ambani", "ff5478fs", g1);
        s1.compDetails();

    }
}
