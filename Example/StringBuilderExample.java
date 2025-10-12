public class StringBuilderExample {
    public static void main(String[] args) 
    {
        StringBuilder example = new StringBuilder("Hello");

        example.append(" World");
        System.out.println("After append: " + example);

        example.insert(6, "Java ");
        System.out.println("After insert: " + example);

        example.replace(6, 10, "C++");
        System.out.println("After replace: " + example);

        example.delete(6, 9);
        System.out.println("After delete: " + example);

        example.reverse();
        System.out.println("After reverse: " + example);
    }
}
