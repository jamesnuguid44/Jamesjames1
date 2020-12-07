package Basics.Lesson5;

public class Circle {
    private int radius;
    private int diameter;
    private double area;

    public Circle(){
        radius = 1;
        diameter = radius*2;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int rad){
        radius = rad;
        diameter = radius*2;
        area = Math.PI * Math.pow(radius, 2);
    }

    public int getRadius(){
        return radius;
    }

    public int getDiameter(){
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
