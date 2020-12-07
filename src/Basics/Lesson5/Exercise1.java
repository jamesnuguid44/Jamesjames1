package Basics.Lesson5;
import java.time.*;
public class Exercise1 {
    public static void main(String[] args) {
        int min,hour;
        LocalDateTime time;
        time = LocalDateTime.now();
        //time = LocalDateTime.of(2000,10,28,9,7);
        hour = time.getHour();
        min = time.getMinute();
        System.out.println("Current time is: "+ (hour<10? ("0"+hour):hour) +":"+ (min<10? ("0"+min):min));

    }
}
