package Basics.Lesson10;

public class Diagonal0s {
    public static void main(String[] args) {
        String forPrint = "0";
        String space = " ";
        int num = 0;
        do {
            System.out.println(forPrint);
            forPrint= (space+forPrint);
            num++;
        }while(num<10);
    }
}
