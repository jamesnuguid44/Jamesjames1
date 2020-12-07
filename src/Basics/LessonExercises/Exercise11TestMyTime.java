package Basics.LessonExercises;
import java.util.Scanner;

public class Exercise11TestMyTime {
    public static int hour;
    public static int minute;
    public static int second;
    MyTime clockTime = new MyTime();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        MyTime clockTime = new MyTime();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter hour: ");
        hour = scan.nextInt();
        clockTime.setHour(hour);

        System.out.print("Enter minute: ");
        minute = scan.nextInt();
        clockTime.setMinute(minute);

        System.out.print("Enter second: ");
        second = scan.nextInt();
        clockTime.setSecond(second);

        System.out.println("");

        System.out.println(clockTime.toString());
    }
}
