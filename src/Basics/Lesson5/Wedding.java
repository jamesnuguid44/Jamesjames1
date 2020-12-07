package Basics.Lesson5;
import java.time.LocalDate;

public class Wedding {
    LocalDate weddingDate = LocalDate.of(2024, 11, 27);
    Couple couple = new Couple();
    String husband = couple.getGroom();
    String wife = couple.getBride();
    String place = "San Fernando, Pampanga";

    @Override
    public String toString() {
        return "Wedding date: " + weddingDate.getMonth() +" "+ weddingDate.getDayOfMonth()+ " " + weddingDate.getYear() +
                "\nCouple is "+ husband + " and " + wife +
                "\nThe Venue is " + place;
    }
}
