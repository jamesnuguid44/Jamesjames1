package Basics.Lesson5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle2.setRadius(5);

        System.out.println("Radius of Circle 1 is "+circle1.getRadius());
        System.out.println("Diameter is "+circle1.getDiameter());
        System.out.println("Area is "+circle1.getArea());

        System.out.println("\nRadius of Circle 2 is "+circle2.getRadius());
        System.out.println("Diameter is "+circle2.getDiameter());
        System.out.println("Area is "+circle2.getArea());

    }
}
