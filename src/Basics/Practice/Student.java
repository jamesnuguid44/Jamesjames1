package Basics.Practice;

public class Student {
    private char gender;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public Student(char gender, String firstName, String lastName) {
        String salutation = (gender == 'M') ? "Mr." : "Ms";
        this.name = salutation + " " + firstName + " " + lastName;
    }

    public Student(String firstName, String middleName, String lastName) {
        this.name = firstName + " " + middleName.charAt(0) + ". " + lastName;
    }

    public String toString() {
        return this.name;
    }
}
