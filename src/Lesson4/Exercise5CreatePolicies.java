package Lesson4;

public class Exercise5CreatePolicies {
    public static void main(String[] args) {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");

        //uses display method
        first.display();
        second.display();
        third.display();
    }
}
