package Lesson6;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerOne;
        String playerTwo;
        int oneWeapon;
        int twoWeapon;

        System.out.print("Please enter name of player 1: ");
        playerOne = scan.next();
        System.out.print("Please enter name of player 2: ");
        playerTwo = scan.next();

        System.out.print("\nHi "+playerOne+"! Please choose (1-rock, 2-paper, 3-scissors): ");
        oneWeapon = scan.nextInt();
        System.out.print("Hi "+playerTwo+"! Please choose (1-rock, 2-paper, 3-scissors): ");
        twoWeapon = scan.nextInt();
        System.out.println(" ");

        if ((oneWeapon==1 && twoWeapon==3)||(oneWeapon==2 && twoWeapon==1)||(oneWeapon==3 & twoWeapon==2))
            System.out.println(playerOne+" wins!");
        else if ((twoWeapon==1 && oneWeapon==3)||(twoWeapon==2 && oneWeapon==1)||(twoWeapon==3 & oneWeapon==2))
            System.out.println(playerTwo+" wins!");
        else
            System.out.println("It's a tie!");
    }
}
