public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 4;  

        System.out.println("Multiplication Table of " + num);

        for(int i = 1; i <= 10; i++) 
        {
            System.out.println( i + " x " + num + " = " + (num * i));
        }
    }
}
