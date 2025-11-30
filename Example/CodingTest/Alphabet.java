public class Alphabet {
    public static void main(String[] args) {
        
        char check = '6'; 
        

        if((check >= 'A' && check <= 'Z') || (check >= 'a' && check <= 'z')) {
            System.out.println(check + " is an alphabet.");
        } else {
            System.out.println(check + " is not an alphabet.");
        }
    }
}
