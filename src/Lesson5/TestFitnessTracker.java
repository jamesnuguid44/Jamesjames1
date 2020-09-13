package Lesson5;

public class TestFitnessTracker {
    public static void main(String[] args) {
        String activity = "Climbing";
        int minutes = 5;
        FitnessTracker tracker = new FitnessTracker();
        tracker.setActivity(activity);
        tracker.setMinutes(minutes);

        System.out.println("Fitness activity is "+ tracker.getActivity());
        System.out.println("Spent minutes is "+ tracker.getMinutes());
        System.out.println("Date is "+ tracker.getDate());

        System.out.println("\n");

        FitnessTracker tracker2 = new FitnessTracker("Sprinting", 8);
        tracker2.display();
    }
}
