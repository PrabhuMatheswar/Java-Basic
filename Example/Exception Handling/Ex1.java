// try
public class Ex1 {
    public static void main(String[] args) {
        try {
            int c= 10, d = 2;
            int result = c/ d; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}
