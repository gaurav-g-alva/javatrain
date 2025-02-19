
public class Company {
    String Name;
    String ceoName;
    String Loc;
    private Gst gst;

    public Company(String Name,String ceoName,String Loc,Gst gst) {
        this.Name = Name;
        this.ceoName = ceoName;
        this.Loc = Loc;
        this.gst = gst;
    }
    public Gst getGst(){
        return gst;
    }
    public void compDetails(){
        System.out.println("\nComp Name : "+Name+"\nComp CEO : " + ceoName+"\nLoc :"+Loc);
        gst.gstDetails();
    }
}
