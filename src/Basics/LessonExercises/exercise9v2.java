package Basics.LessonExercises;
import java.util.Scanner;

public class exercise9v2 {
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();

    }

    static void addition(){
        Scanner numscan = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        int num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        int num2 = numscan.nextInt();
        System.out.println("Addition result is: " + (num1 + num2));
    }

    static void subtraction(){
        Scanner numscan = new Scanner(System.in);
        System.out.print("\nPlease enter first integer: ");
        int num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        int num2 = numscan.nextInt();
        System.out.println("Subtraction result is: " + (num1 - num2));
    }

    static void multiplication(){
        Scanner numscan = new Scanner(System.in);
        System.out.print("\nPlease enter first integer: ");
        int num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        int num2 = numscan.nextInt();
        System.out.println("Multiplication result is: " + (num1 * num2));
    }

    static void division(){
        Scanner numscan = new Scanner(System.in);
        System.out.print("\nPlease enter first integer: ");
        int num1 = numscan.nextInt();
        System.out.print("Please enter second integer: ");
        int num2 = numscan.nextInt();
        System.out.println("Division result is: " + (num1 / num2));
    }
}
