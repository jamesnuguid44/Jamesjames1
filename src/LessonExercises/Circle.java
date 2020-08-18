package LessonExercises;

public class Circle {
    private double radius;
    private double circumference;
    private double diameter;

    public void setRadius(double radius1) {
        radius = radius1;
    }

    public double getRadius(){
        return radius;
    }

    public double Circumference(){
        double circum = 2 * 3.14159 * radius;
        circumference = circum;
        return circumference;
    }

    public double Diameter(){
        //double diam = 2*radius;
        //diameter = diam;
        return radius*2;
    }

}
