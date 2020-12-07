package Basics.Lesson3;
import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter minimum price for discount: ");
        price = scan.nextDouble();

        System.out.print("Enter discount: ");
        discount = scan.nextDouble();

        savings = ComputeDiscount(price, discount);

        System.out.println("For a minimum spend of $"+price);
        System.out.println("You'll get a discount of "+discount+"%");
        System.out.println("You'll save atleast $"+savings);
    }

    public static double ComputeDiscount(double pricee, double discountt){
        double saving;
        saving = pricee * discountt / 100;
        return saving;
    }
}
