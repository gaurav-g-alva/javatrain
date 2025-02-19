
public class Patent {
    String ownerShip;
    int patentNum;

    public Patent(String ownerShip, int patentNum){
        this.ownerShip =ownerShip;
        this.patentNum = patentNum;
    }
    public void patentDetails(){
        System.out.println("Owner Name : "+ownerShip+"\nPatent Number : "+patentNum);
        
    }
}
