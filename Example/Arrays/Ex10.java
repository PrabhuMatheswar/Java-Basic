// 2D arrays using Arrays.deepEquals()
import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        String[][] grid1 = {
            {"Ram", "Ravi"},
            {"Tamil", "Kumar"}
        };
        String[][] grid2 = {
            {"Gokul", "Umesh"},
            {"Balu", "Dinesh"}
        };

        System.out.println(Arrays.deepEquals(grid1, grid2)); 
    }
}
