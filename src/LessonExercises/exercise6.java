package LessonExercises;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int num = scan.nextInt();

        int square = num * num;
                System.out.println("\nSquare: "+square);

        int cube = num * num * num;
                System.out.println("Cube: "+cube);

        int fourth = num * num * num * num;
                System.out.println("Fourth Power: "+fourth);

    }
}
