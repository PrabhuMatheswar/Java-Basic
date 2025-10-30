class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }
}

public class Parameterized {
    public static void main(String[] args) {
        Student s1 = new Student(401, "Ravi");
        Student s2 = new Student(402, "Hari");

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
