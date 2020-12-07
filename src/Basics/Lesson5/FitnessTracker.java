package Basics.Lesson5;
import java.time.*;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private String date;

    public FitnessTracker(){
        LocalDate datee;
        datee = LocalDate.now();
        activity = "Running";
        minutes = 0;
        date = "January 1 "+ datee.getYear();
    }

    public FitnessTracker(String act, int min){
        LocalDate datee;
        datee = LocalDate.now();
        activity = act;
        minutes = min;
        date = "January 1 "+ datee.getYear();
    }

    public void setActivity(String act){
        activity = act;
    }

    public void setMinutes(int min){
        minutes = min;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getActivity() {
        return activity;
    }

    public String getDate() {
        return date;
    }

    public void display(){
        System.out.println("Fitness activity is "+ activity);
        System.out.println("Spent minutes is "+ minutes);
        System.out.println("Date is "+ date);
    }
}
