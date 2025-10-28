class Student {
    String name;
    int marks;

    // Public instance method
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Static method
    static void collegeInfo() {
        System.out.println("College: SRM Engineering College");
    }
}

public class Example {
    public static void main(String[] args) {
        // Calling static method without creating object
        Student.collegeInfo();

        // Creating object for instance method
        Student s1 = new Student();
        s1.name = "Kumar";
        s1.marks = 95;
        s1.displayDetails();
    }
}
