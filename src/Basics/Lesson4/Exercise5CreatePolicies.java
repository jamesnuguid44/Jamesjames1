package Basics.Lesson4;

public class Exercise5CreatePolicies {
    public static void main(String[] args) {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");

        //uses display method
        first.display();
        second.display();
        third.display();
        //added to test if it will compile without a defult constructor
        CarInsurancePolicy fourth = new CarInsurancePolicy();
        fourth.display();
    }
}
