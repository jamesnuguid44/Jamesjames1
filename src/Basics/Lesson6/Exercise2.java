package Basics.Lesson6;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 10;

        System.out.print("Please guess the number: ");
        int guess = scan.nextInt();

        int random = (int) (Math.random() * MAX) + MIN;
        System.out.println("The correct answer is: " + random);

        if (guess > random)
            System.out.println("Your guess is higher!");
        else if (guess < random)
            System.out.println("Your guess is lower!");
        else
            System.out.println("Your guess is correct!");
    }
}