
class User {
    String name = "Gokul";

    void play() {
        System.out.println(name+ " is Playing.");
    }
}


class Student extends User {
    void study() {
        System.out.println( name+" is studying.");
    }
}


public class ex1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.play();
        s.study();
    }
}
