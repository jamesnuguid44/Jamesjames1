package Basics.LessonExercises;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = num.nextInt();
        int numnum = number % 2;

        String oddeven = numnum == 0 ? "even number" : "odd number";
        System.out.println(number +" is an "+ oddeven);
    }
}
