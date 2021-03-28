package Intermediate.Lesson02;

public class Alien {
    protected int numberOfEyes;
    protected int numberOfHands;
    protected String alienName;

    Alien (){
    }

    @Override
    public String toString() {
        return "Alien Name: "+ this.alienName +
                "\nNumber of Eyes: " + this.numberOfEyes +
                "\nNumber of Hands: " + this.numberOfHands;
    }
}
