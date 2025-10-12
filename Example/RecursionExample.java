public class RecursionExample {

// Recursive method to calculate factorial
    static int factorial(int k) {
        if (k == 0 || k == 1) 
        {  
            return 1;
        } 
        else 
        {                  
            return k * factorial(k - 1);
        }
    }

    public static void main(String[] args)
     {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}
