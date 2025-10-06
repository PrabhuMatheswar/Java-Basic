public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 2000; 
        double rate = 6; 
        int time = 3; 

        double Interest = (principal * rate * time) / 100;

        System.out.println("principal: " + principal);
        System.out.println("Interest: " + Interest);
        System.out.println("Total: " + (principal+Interest));

    }
}
