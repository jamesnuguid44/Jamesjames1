package Lesson3;

public class SpaService {
 private String serviceDescription;
 private double price;

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
