
public class Person {
    String firstName;
    String lastName;
    String Dob;
    private Aadhar aadhar;

    public Person(String firstName,String lastName,String Dob,Aadhar aadhar){
        this.firstName =firstName;
        this.lastName =lastName;
        this.Dob= Dob;
        this.aadhar = aadhar;
    }
    public Aadhar getaadhar(){
        return aadhar;
    }
    public void  personDetails(){
        System.out.println("\nName :"+firstName+lastName+"\nDOB : "+Dob);
        aadhar.aadharDetails();
    }
}
