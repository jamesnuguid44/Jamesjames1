package Basics.LessonExercises;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner numscan = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        int num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        int num2 = numscan.nextInt();

        System.out.println("\nAddition result is: " + (num1 + num2));
        System.out.println("Subtraction result is: " + (num1 - num2));
        System.out.println("Multiplication result is: " + (num1 * num2));
        System.out.println("Division result is: " + (num1 / num2));

    }
}
