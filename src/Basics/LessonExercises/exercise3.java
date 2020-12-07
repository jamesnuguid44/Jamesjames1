package Basics.LessonExercises;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    int number = num.nextInt();
    int numnum = number % 2;

    boolean even = numnum == 0;
    System.out.println("\nIs "+number+" an even number? "+ even );

    System.out.println("Is "+number+" an odd number? "+ (numnum==1));
    }
}
