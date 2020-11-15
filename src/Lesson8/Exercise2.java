package Lesson8;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = 1;
        System.out.print("Please enter a number: ");
        int endNum = scan.nextInt();

        while(startNum <= endNum){
            System.out.print(startNum + ", ");
            startNum++;
        }

    }
}
