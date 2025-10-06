public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int Num1 = 20;
        int Num2 = 10;

        System.out.println("Before Swap:");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);

        int temp = Num1;
        Num1 = Num2;
        Num2 = temp;

        System.out.println("After Swap:");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);
    }
}
