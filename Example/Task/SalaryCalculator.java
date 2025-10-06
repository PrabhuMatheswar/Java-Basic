
public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your annual salary: "+1000000);
        double annualSalary = 1000000;

        double monthlySalary = annualSalary / 12;
        double weeklySalary = annualSalary / 52;
        double dailySalary = annualSalary / 260;
        double hourlySalary = dailySalary / 8; 
        System.out.printf("Monthly Salary: %.2f\n", monthlySalary);
        System.out.printf("Weekly Salary: %.2f\n", weeklySalary);
        System.out.printf("Daily Salary: %.2f\n", dailySalary);
        System.out.printf("Hourly Salary: %.2f\n", hourlySalary);

    }
}


