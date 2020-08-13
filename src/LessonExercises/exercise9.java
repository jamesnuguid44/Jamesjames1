package LessonExercises;
import java.util.Scanner;

public class exercise9 {
    static int num1;
    static int num2;
    public static void main(String[] args) {

        Scanner numscan = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        num2 = numscan.nextInt();
        operations();
    }

    public static void operations(){


            System.out.println("\nAddition result is: " + (num1 + num2));
            System.out.println("Subtraction result is: " + (num1 - num2));
            System.out.println("Multiplication result is: " + (num1 * num2));
            System.out.println("Division result is: " + (num1 / num2));

        }
}
