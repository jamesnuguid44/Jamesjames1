package Basics.Lesson8;

public class Exercise1 {
    public static void main(String[] args) {
        String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        int monthNum = 0;

        while (monthNum < MONTHS.length){
            System.out.print(MONTHS[monthNum]+ ", ");
            monthNum++;
        }
    }
}
