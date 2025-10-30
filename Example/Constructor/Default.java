class Student {
    int id;
    String name;
    Student() {
        id = 1;
        name = "Laxman";
    }
}

public class Default{
    public static void main(String[] args) 
    {
        Student s1 = new Student();  
        System.out.println(s1.id);   
        System.out.println(s1.name); 
    }
}
