package Basics.Lesson4;

import java.util.Scanner;

public class Exercise4CreateSpaServices {
    public static void main(String[] args) {
        String service;
        double price;
        SpaServiceWithConstructor firstService = new SpaServiceWithConstructor();
        SpaServiceWithConstructor secondService = new SpaServiceWithConstructor();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter service: ");
        service = scan.nextLine();
        System.out.print("Enter price: ");
        price = scan.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        //scan.nextLine();
        //System.out.print("Enter service: ");
        //service = scan.nextLine();
        //System.out.print("Enter price: ");
        //price = scan.nextDouble();

        //secondService.setServiceDescription(service);
        //secondService.setPrice(price);

        System.out.println("First service details: "+firstService.getServiceDescription() + " $"+ firstService.getPrice());
        System.out.println("Second service details: "+secondService.getServiceDescription()+ " $"+secondService.getPrice());
    }
}
