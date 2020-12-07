package Basics.PracticeExercisesLesson0406;

public class PickTwoCardsV2 {
    public static void main(String[] args) {
        char suit = '0';
        int rank1;
        int rank2;

        int suitnum = (int) (Math.random() * 4) + 1;
        // 1=Spades 2=Hearts 3=Diamonds 4=Clubs
        if (suitnum == 1) { suit = 's'; }
        else if (suitnum == 2) { suit = 'h';}
        else if (suitnum == 3) { suit = 'd';}
        else if (suitnum == 4) { suit = 'c';}
        rank1 = (int) (Math.random() * 13) + 1;
        Card firstCard = new Card(suit, rank1);

        int suitnum2 = (int) (Math.random() * 4) + 1;
        // 1=Spades 2=Hearts 3=Diamonds 4=Clubs
        if (suitnum2 == 1) { suit = 's'; }
        else if (suitnum2 == 2) { suit = 'h';}
        else if (suitnum2 == 3) { suit = 'd';}
        else if (suitnum2 == 4) { suit = 'c';}
        rank2 = (int) (Math.random() * 13) + 1;
        Card secondCard = new Card(suit, rank2);

        System.out.println("\nThe first card is " + firstCard + "\nThe second card is " + secondCard);

        if (rank1 > rank2) {
            System.out.println("\nFirst card is higher of rank!");
        } else if (rank1 < rank2) {
            System.out.println("\nSecond card is higher of rank!");
        } else System.out.println("\nCards are of same rank!");
    }
}
