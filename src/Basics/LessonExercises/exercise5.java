package Basics.LessonExercises;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        int meter = scan.nextInt();
        System.out.print("Enter hour: ");
        int hour = scan.nextInt();
        System.out.print("Enter minutes: ");
        int minute = scan.nextInt();
        System.out.print("Enter seconds: ");
        int second = scan.nextInt();

        float totalsec = ((hour*60)+minute) *60f + second;
        //System.out.println(totalsec);
        float totalkm = meter/1000.0f;
        //System.out.println(totalkm);
        float miles = meter/1609.34f;
        //System.out.println(miles);

        System.out.println("\nYour speed in meters/second is " + (meter/totalsec));
        System.out.println("your speed in km/h is " + ((totalkm)/ (totalsec/3600.0f)));
        System.out.println("Your speed in mile/h is " + (miles/hour));

    }
}
