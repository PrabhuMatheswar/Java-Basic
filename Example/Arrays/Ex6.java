// stream()

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();
        System.out.println("Sum = " + sum); 
    }
}
