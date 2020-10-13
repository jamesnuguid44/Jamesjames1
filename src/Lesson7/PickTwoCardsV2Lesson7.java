package Lesson7;

public class PickTwoCardsV2Lesson7 {
    public static void main(String[] args) {
        int rank1;
        int rank2;

        int suitnum = (int) (Math.random() * 4) + 1;
        // 1=Spades 2=Hearts 3=Clubs 4=Diamonds
        // put switch here
        rank1 = (int) (Math.random() * 13) + 1;
        CardV2 firstCard = new CardV2(suitnum, rank1);

        int suitnum2 = (int) (Math.random() * 4) + 1;
        // 1=Spades 2=Hearts 3=Clubs 4=Diamonds
        //put switch here
        rank2 = (int) (Math.random() * 13) + 1;
        CardV2 secondCard = new CardV2(suitnum2, rank2);

        System.out.println("\nThe first card is " + firstCard + "\nThe second card is " + secondCard);

        if (rank1 > rank2) {
            System.out.println("\nFirst card is higher of rank!");
        } else if (rank1 < rank2) {
            System.out.println("\nSecond card is higher of rank!");
        } else System.out.println("\nCards are of same rank!");
    }
}
