package PracticeExercisesLesson0406;

public class Card {
    private char suit;
    private int rank;

    public Card(char suit, int rank) {
        this.suit = suit;
        this.rank = rank;

    }

    @Override
    public String toString() {
        String suit = "";

        if (this.suit=='s'){ suit = "Spades";}
        else if (this.suit=='h'){ suit = "Hearts";}
        else if (this.suit=='d'){ suit = "Diamonds";}
        else if (this.suit=='c'){ suit = "Clubs";}
        return rank + " of " + suit;
        
    }
}
