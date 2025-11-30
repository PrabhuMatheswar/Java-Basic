public class Prime {
    public static void main(String[] args){
        int num = 23;
        boolean prime = num > 1;

        for(int i=2; i*i<=num; i++)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
        }

        System.out.println(num + (prime ? " is Prime" : " is Not Prime"));
    }
}
