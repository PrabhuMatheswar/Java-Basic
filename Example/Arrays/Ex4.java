// copyOf() and Arrays.copyOfRange()

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        int[] copy = Arrays.copyOf(original, 3); 
        int[] rangeCopy = Arrays.copyOfRange(original, 1, 4); 

        System.out.println(Arrays.toString(copy));    
        System.out.println(Arrays.toString(rangeCopy));
    }
}
