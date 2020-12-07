package Basics.Lesson7;

import java.util.Scanner;

public class PickTwoCardsLesson7 {
    public static void main(String[] args) {
        int suit;
        int rank1;
        int rank2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the suit of the first card (1 - spades, 2 - hearts, 3 - clubs, or 4 - diamonds): ");
        suit = scan.nextInt();
        rank1 = (int) (Math.random() * 13) + 1;
        CardV2 firstCard = new CardV2(suit, rank1);

        System.out.print("Please enter the suit of the second card (1 - spades, 2 - hearts, 3 - clubs, or 4 - diamonds): ");
        suit = scan.nextInt();
        rank2 = (int) (Math.random() * 13) + 1;
        CardV2 secondCard = new CardV2(suit, rank2);

        System.out.println("\nThe first card is " + firstCard + "\nThe second card is " + secondCard);

        if (rank1 > rank2) {
            System.out.println("First card is higher of rank!");
        } else if (rank1 < rank2) {
            System.out.println("Second card is higher of rank!");
        } else System.out.println("Cards are of same rank!");

    }
}
