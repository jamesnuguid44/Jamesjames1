package Basics.LessonExercises;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 10;

        System.out.print("Please guess the number: ");
        int guess = scan.nextInt();

        int random = (int)(Math.random() * MAX) + MIN;
        System.out.println("The correct answer is: "+ random);

        String result = "Your guess is Correct!";
        result = guess < random? "Your guess is lower!" : result;
        result = guess > random? "Your guess is higher!" : result;
        System.out.println(result);
    }
}
