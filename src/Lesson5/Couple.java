package Lesson5;

public class Couple {
    public static void main(String[] args) {
        Person husband = new Person("Noah", "Flynn", 2000,10,28);
        Person wife = new Person("Elle", "Evans", 1999, 11, 26);
        String husbandName = husband.getFirstName() + "" + husband.getLastName();
        String wifeName = wife.getFirstName(); + "" + wife.getLastName();
    }



}
