package LessonExercises;
import java.util.Scanner;

public class Exercise10CircleMain {

    public static void main(String[] args) {
        double radius;
        Circle size = new Circle();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = scan.nextDouble();
        size.setRadius(radius);

        System.out.println("Circumference: "+size.Circumference());
        System.out.println("Diameter: "+size.Diameter());



    }
}
