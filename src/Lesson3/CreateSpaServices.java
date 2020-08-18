package Lesson3;
import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
        String service;
        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter service: ");
        service = scan.nextLine();
        System.out.print("Enter price: ");
        price = scan.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        scan.nextLine();
        System.out.print("Enter service: ");
        service = scan.nextLine();
        System.out.print("Enter price: ");
        price = scan.nextDouble();

        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        System.out.println(firstService.getServiceDescription() + " $"+ firstService.getPrice());
        System.out.println(secondService.getServiceDescription()+ " $"+secondService.getPrice());
    }
}
