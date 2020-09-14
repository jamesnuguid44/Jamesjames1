package Lesson5;

public class Couple {
    public String getGroom() {
        Person husband = new Person("Noah", "Flynn", 2000,10,28);
        String husbandName = husband.getFirstName() + "" + husband.getLastName();
        return husbandName;
    }

    public String getBride() {
        Person wife = new Person("Elle", "Evans", 1999, 11, 26);
        String wifeName = wife.getFirstName() + "" + wife.getLastName();
        return wifeName;
    }



}
