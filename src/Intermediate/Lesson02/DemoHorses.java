package Intermediate.Lesson02;

public class DemoHorses {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        RaceHorse horse3 = new RaceHorse();

        horse1.setName("Jack");
        horse1.setColor("Blue");
        horse1.setBirthYear(2000);

        horse2.setName("Yuri");
        horse2.setColor("red");
        horse2.setBirthYear(2001);
        horse2.setNumberOfRaces(10);

        horse3.setName("Angel");
        horse3.setColor("green");
        horse3.setBirthYear(2002);
        horse3.setNumberOfRaces(12);

        System.out.println("Horse #1\n" +
                "Name: "+ horse1.getName() +
                "\nColor: "+ horse1.getColor() +
                "\nBirth Year: " + horse1.getBirthYear());

        System.out.println("\nHorse #2\n" +
                "Name: "+ horse2.getName() +
                "\nColor: "+ horse2.getColor() +
                "\nBirth Year: " + horse2.getBirthYear() +
                "\nNumber of Races: " + horse2.getNumberOfRaces());

        System.out.println("\nHorse #3\n" +
                "Name: "+ horse3.getName() +
                "\nColor: "+ horse3.getColor() +
                "\nBirth Year: " + horse3.getBirthYear() +
                "\nNumber of Races: " + horse3.getNumberOfRaces());
    }
}
