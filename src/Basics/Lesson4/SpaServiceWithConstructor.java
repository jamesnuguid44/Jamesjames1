package Basics.Lesson4;

public class SpaServiceWithConstructor {
    private String serviceDescription;
    private double price;
    //constructor
    public SpaServiceWithConstructor(){
        serviceDescription = "xxx";
        price = 0;
    }

    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public void setPrice(double pricee){
        price = pricee;
    }


    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }
}
