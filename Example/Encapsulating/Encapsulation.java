class EncapsulationDemo{
    private int id;
    private String empName;
    private int empAge;

    public int getEmpid(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpid(int newValue){
        id = newValue;
    }
}
public class Encapsulation{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Tamil");
         obj.setEmpAge(32);
         obj.setEmpid(13456);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee id: " + obj.getEmpid());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}