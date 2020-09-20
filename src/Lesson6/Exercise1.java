package Lesson6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.print("Please enter an integer: ");
            int number = num.nextInt();
            int numnum = number % 2;

            if (numnum == 1)
                System.out.println(number + " is an odd number");
            else
                System.out.println(number + " is an even number");
        }
    }
