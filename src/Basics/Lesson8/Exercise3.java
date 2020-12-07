package Basics.Lesson8;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user;

        int oneWeapon;
        int twoWeapon;
        String[] WEAPON = {"Default", "Rock", "Paper", "Scissors"};

        System.out.print("Please enter name of user: ");
        user = scan.next();
        oneWeapon = getUserWeapon(scan);
        twoWeapon = getRandom();
        boolean match = ((oneWeapon == 1 && twoWeapon == 3) || (oneWeapon == 2 && twoWeapon == 1) || (oneWeapon == 3 & twoWeapon == 2));

        while (match == false) {
            if ((twoWeapon == 1 && oneWeapon == 3) || (twoWeapon == 2 && oneWeapon == 1) || (twoWeapon == 3 & oneWeapon == 2)) {
                System.out.println("You pick " + WEAPON[oneWeapon] + ". Computer picks " + WEAPON[twoWeapon] + "." + "\nComputer wins! Try again!");
            } else if ((twoWeapon == 1 && oneWeapon == 1) || (twoWeapon == 2 && oneWeapon == 2) || (twoWeapon == 3 & oneWeapon == 3)) {
                System.out.println("You pick " + WEAPON[oneWeapon] + ". Computer picks " + WEAPON[twoWeapon] + "." + "\nIt's a tie! Try again!");
            }
            oneWeapon = getUserWeapon(scan);
            twoWeapon = getRandom();
            match = ((oneWeapon == 1 && twoWeapon == 3) || (oneWeapon == 2 && twoWeapon == 1) || (oneWeapon == 3 & twoWeapon == 2));
        }

        //if ((oneWeapon == 1 && twoWeapon == 3) || (oneWeapon == 2 && twoWeapon == 1) || (oneWeapon == 3 & twoWeapon == 2))
        System.out.println("You pick " + WEAPON[oneWeapon] + ". Computer picks " + WEAPON[twoWeapon] + ".\n" + user + " wins!");
    }


    private static int getUserWeapon(Scanner scan){
        System.out.print("Please choose (1-rock, 2-paper, 3-scissors): ");
        int oneeWeapon = scan.nextInt();
        return oneeWeapon;
    }
    private static int getRandom(){
        int twooWeapon = (int) (Math.random() * 3) + 1;
        return twooWeapon;
    }
}
