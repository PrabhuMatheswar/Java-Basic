public class Palindrome{
    public static void main(String[] args) {
        int num = 135;
        int original = num;
        int reversed = 0;

        while(num > 0){
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }

        if(original == reversed)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is Not a Palindrome");
    }
}
