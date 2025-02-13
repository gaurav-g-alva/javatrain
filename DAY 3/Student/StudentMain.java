
public class StudentMain {
    public static void main(String[] args) {
        Student S1 = new Student("GAURAV",121, 98);
        System.out.println("Name: "+ S1.getName());
        System.out.println("Roll Number: "+ S1.getRollNumber());
        System.out.println("Marks: "+ S1.getMarks());
        System.out.println("Grade: "+ S1.getGrade());

        S1.setName("SAU"); //name modify
        S1.setMarks(85); //mark  modify

        System.out.println("Name: " + S1.getName());
        System.out.println("Roll Number: " + S1.getRollNumber());
        System.out.println("Marks: " + S1.getMarks());
        System.out.println("Grade: " + S1.getGrade());
    }
}
