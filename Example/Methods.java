class Methods {

    //With Argument - With Return Type
    int add(int a, int b) {
        return a + b;
    }

    //Without Argument - Without Return Type
    void displayMessage() {
        System.out.println("Welcome to Java");
    }

    //Without Argument - With Return Type
    String getGreeting() {
        return "Good luck";
    }

    //With Argument - Without Return Type
    void printSquare(int num) {
        System.out.println("Square of " + num + " = " + (num * num));
    }

    // main method
    public static void main(String[] args) {
        Methods obj = new Methods();
        int sum = obj.add(10, 20);
        System.out.println("Sum = " + sum);
        obj.displayMessage();
        String greet = obj.getGreeting();
        System.out.println(greet);
        obj.printSquare(5);
    }
}
