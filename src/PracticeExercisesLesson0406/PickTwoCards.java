package PracticeExercisesLesson0406;
import java.util.Scanner;

public class PickTwoCards {
    public static void main(String[] args) {
        char suit;
        int rank1;
        int rank2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the suit of the first card (s - spades, h - hearts, d - diamonds, or c - clubs): ");
        suit = scan.next().charAt(0);
        rank1 = (int) (Math.random() * 13) + 1;
        Card firstCard = new Card(suit, rank1);

        System.out.print("Please enter the suit of the second card (s - spades, h - hearts, d - diamonds, or c - clubs): ");
        suit = scan.next().charAt(0);
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
