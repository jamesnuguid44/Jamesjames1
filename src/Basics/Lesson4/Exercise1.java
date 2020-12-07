package Basics.Lesson4;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(sum(10,10));
        System.out.println(sum(10,10,10));
        System.out.println(sum(10,10,10,10));
        System.out.println(sum(10,10,10,10,10));

    }

    //overloaded methods
    public static int sum(int sum1, int sum2){
        return sum1 + sum2;
    }
    public static int sum(int sum1, int sum2, int sum3) {
        return sum1 + sum2 + sum3;
    }
    public static int sum(int sum1, int sum2, int sum3, int sum4) {
        return sum1 + sum2 + sum3 + sum4;
    }
    public static int sum(int sum1, int sum2, int sum3, int sum4, int sum5) {
        return sum1 + sum2 + sum3 + sum4 + sum5;
    }
}
