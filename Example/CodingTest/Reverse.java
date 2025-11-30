public class Reverse{
    public static void main(String[] args) {
        int num1 = 12345;  
        int num2 = 0;

        while (num1 != 0) {
            int digit = num1 % 10;       
            num2 = num2 * 10 + digit; 
            num1 = num1 / 10;          
        }

        System.out.println("Reversed Number: " + num2);
    }
}
