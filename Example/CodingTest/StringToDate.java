import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class StringToDate {
    public static void main(String[] args) {

        String dateString = "30-11-2025"; 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = formatter.parse(dateString); 
            System.out.println("String to Date: " + date);
        } catch (ParseException e) 
        {
            System.out.println("Invalid date format");
        }
    }
}
