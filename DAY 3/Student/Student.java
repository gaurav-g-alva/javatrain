
public class Student {
    private String name;
    private  final int rollNumber;
    private double marks;
    private String grade;

    public Student(String name, int rollNumber, int marks ){
        this.name = name;
        this.rollNumber = rollNumber;
        setMarks(marks);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        setGrade();
    }

    private void setGrade() {
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }
    
}


