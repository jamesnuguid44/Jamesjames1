package Intermediate.Lesson01;
import java.util.Arrays;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] num = new double[15];
        int average;

        for(int arrayNum=0; arrayNum<num.length; arrayNum++){
            System.out.print("Enter integer "+(arrayNum+1)+ ": ");
            num[arrayNum]= scan.nextDouble();
        }

        System.out.println("");
        average = (int) Arrays.stream(num).sum()/ num.length;
        System.out.println("Average: "+average);



        for(int printArray=0; printArray< num.length; printArray++){
            System.out.println(num[printArray] + ", "+ (average-num[printArray]));
        }

    }
}
