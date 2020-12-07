package Basics.Lesson9;
import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInterval;
        System.out.print("Please enter the interval of counting: ");
        numInterval = scanner.nextInt();
        int numIntervalNew = numInterval;
        int numInterval10 = numInterval*10;

        for ( ; numIntervalNew <= 500;numIntervalNew+=numInterval ){
            if (numIntervalNew == numInterval10){
                System.out.print(" "+ numIntervalNew + "\n");
                //numIntervalNew+=numInterval;
                numInterval10+=numInterval10;
            }
            else {
                System.out.print(numIntervalNew+" ");
                //numIntervalNew+=numInterval;
            }
        }

    }
}
