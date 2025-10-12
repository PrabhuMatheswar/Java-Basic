public class methodoverloading {

    // add two ints
    public int add(int a, int b) {
        return a + b;
    }

    //add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    //add three ints
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //multiply with two ints
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        methodoverloading ex = new methodoverloading();
        System.out.println("add(2, 3)=" + ex.add(2, 3));
        System.out.println("add(2.5, 3.1)=" + ex.add(2.5, 3.1));
        System.out.println("add(1, 2, 3)=" + ex.add(1, 2, 3));
        System.out.println("multiply(4, 5)=" + multiply(4, 5));
    }
}
