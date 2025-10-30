class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName) {
        this(empId, empName, 30000); 
    }

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }
}

public class Parameterized2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "sathish");             
        Employee e2 = new Employee(2, "Varun", 25000);     

        e1.display();
        e2.display();
    }
}
