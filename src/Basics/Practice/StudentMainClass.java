package Basics.Practice;

public class StudentMainClass {
    public static void main(String[] args) {
        printStudent(new Student("Julex"));
        printStudent(new Student("Russel", "Manalac"));
        printStudent(new Student('M', "Jan", "Medina"));
        printStudent(new Student("James", "Medina","Nuguid"));
    }

    public static void printStudent(Student student) {
        System.out.println("Student: " + student);
    }
}
