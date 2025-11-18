class Company {
  void CompanyName() {
    System.out.println("Company name is TravelAgency.");
  }
}

class Employee1 extends Company {
  void EmployeeName1() {
    System.out.println("EmployeeName1 is Kumar.");
  }
}

class Employee2 extends Company {
  void EmployeeName2() {
    System.out.println("EmployeeName2 is Laxman.");
  }
}
public class Hierarchical {
  public static void main(String[] args) {
    Employee1 E1 = new Employee1();
    E1.CompanyName(); 
    E1.EmployeeName1(); 
    Employee2 E2 = new Employee2();
    E2.CompanyName(); 
    E2.EmployeeName2(); 
  }
}    