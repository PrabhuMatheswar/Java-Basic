class Student {

    public String name;
    public int marks;

    static String schoolName = "Govt High";

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School: " + schoolName);
    }

    static void showSchool() {
        System.out.println("All students belong to " + schoolName);
    }
}
public class Marks {
    public static void main(String[] args) {

        Student.showSchool();

        Student s1 = new Student("Ram", 90);
        Student s2 = new Student("Ravi", 85);

        s1.displayInfo();
       
        s2.displayInfo();
    }
}
