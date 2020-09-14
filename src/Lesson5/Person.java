package Lesson5;
import java.time.*;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Person(String first, String last, int year, int month, int day){
        firstName = first;
        lastName = last;
        birthdate = LocalDate.of(year, month, day);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
