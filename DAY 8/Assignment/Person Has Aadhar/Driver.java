
public class Driver {
    public static void main(String[] args) {
        Person person = new Person("Gaurav", "Alva", "29/2004", new Aadhar(23456789, "Bellipady"));
        System.out.println(person.firstName);
        System.out.println(person.lastName);
        System.out.println(person.Dob);
        System.out.println(person.getaadhar()); //address
        System.out.println(person.getaadhar().address); 
        System.out.println(person.getaadhar().aadharNum); 

        Aadhar a1 = new Aadhar(234567890, "Puttur");
        a1.aadharDetails();

        Person p1 = new Person("Saurav","alva","18/2008",a1);
        p1.personDetails();

    }
}
