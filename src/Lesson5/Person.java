package Lesson5;
import java.time.*;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Person(String firstName, String lastName, int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;
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
