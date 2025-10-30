class Student{
    void Fee() {
        System.out.println("Student Fee= 60000");
    }
}
class Student_Name extends Student{ 
    void Name() {
        System.out.println("Student Name=Hari");
    }
}
class College {
    public static void main(String [] args) {
        Student_Name p = new Student_Name();
        p.Fee(); 
        p.Name(); 
    }
}
