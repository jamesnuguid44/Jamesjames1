package Lesson7;

public class CardV2 {
    private int suit;
    private int rank;
    private String suits = "";

    public CardV2(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;

    }

    @Override
    public String toString() {
        //String suit = "";

        switch(suit)
        {
            case 1:
                suits = "Spades";
                break;
            case 2:
                suits = "Hearts";
                break;
            case 3:
                suits = "Clubs";
                break;
            case 4:
                suits = "Diamonds";
                break;
        }
        return rank + " of " + suits;
}}
