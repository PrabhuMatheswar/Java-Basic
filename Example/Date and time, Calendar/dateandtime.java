import java.time.*;

public class dateandtime {
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();      
        LocalTime time = LocalTime.now();       
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }
}
