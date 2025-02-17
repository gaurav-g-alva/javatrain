
public class Driver {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent.surname = "Alva";
        Parent.dream();
        Parent.name = "GangsA";
        System.out.println("Parent name : "+Parent.name);
        System.out.println("Parent Surname : "+Parent.surname);


        Daughter d1 = new Daughter();
        Daughter.name= "Saurav";
        System.out.println("\nDaughter name : "+Daughter.name);
        Daughter.dream();
        Daughter.surname = "Gangs";
        System.out.println("Daughter Surname modified : "+Daughter.surname);


        Son s1 = new Son();
        Son.name= "Gaurav";
        System.out.println("\nSon name : "+Son.name);
        Son.dream();
        System.out.println("Son Surname : "+Son.surname);
    }
}