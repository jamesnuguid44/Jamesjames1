package Intermediate.Lesson01;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodDemo {
    static int[] numbers = new int[8];
    static int ave;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int[] numbers = new int[8];
        int answer;

        for (int arrayNum = 0; arrayNum<numbers.length; arrayNum++){
            System.out.print("Enter integer "+(arrayNum+1)+": ");
            numbers[arrayNum]=scan.nextInt();
        }
        ave = (Arrays.stream(numbers).sum())/ numbers.length ;
        //System.out.print(ave);

        System.out.println("");

        do{
            System.out.print("Would you like to: \n(1) display all the integers\n" +
                    "(2) display all the integers in reverse order\n" +
                    "(3) display the sum of the integers\n" +
                    "(4) display all values less than a limiting argument\n" +
                    "(5) display all values that are higher than the calculated average value\n" +
                    "(6) Exit "+"\nPlease enter number of your choice: ");
            answer = scan.nextInt();
            if(answer==1){
                choice1();
                System.out.print("\n\n");
            }
            else if(answer==2){
                choice2();
                System.out.print("\n\n");
            }
            else if (answer==3){
                choice3();
                System.out.print("\n\n");
            }
            else if (answer==4){
                choice4();
                System.out.print("\n\n");
            }
            else if (answer==5){
                choice5();
                System.out.print("\n\n");
            }

        }while(answer != 6);
        System.out.println("Thank you!!");
    }

    static void choice1(){
        System.out.print("The numbers you entered from 1-8 are: " + numbers[0]+ " " + numbers[1] + " " +numbers[2] +  " " +numbers[3] +  " " +numbers[4] +  " " +numbers[5] + " " + numbers[6] +  " " +numbers[7]);
    }

    static void choice2(){
        System.out.print("The numbers you entered from 8-1 are: " + numbers[7]+ " " + numbers[6] + " " + numbers[5] + " " + numbers[4] + " " + numbers[3] + " " + numbers[2] + " " + numbers[1] + " " + numbers[0]);
    }

    static void choice3(){
        System.out.print("The sum of all the numbers that you entered is: "+ (numbers[0]+ numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7]) );
    }

    static void choice4(){
        System.out.println("Average: "+ ave);
        System.out.print("Here are the numbers lower that the average: ");
        for (int num = 0; num < numbers.length; num++){
            if (numbers[num]<ave){
                System.out.print(numbers[num]+ " ");
            }
        }
    }

    static void choice5(){
        System.out.println("Average: "+ ave);
        System.out.print("Here are the numbers higher that the average: ");
        for (int num = 0; num < numbers.length; num++){
            if (numbers[num]>ave){
                System.out.print(numbers[num]+ " ");
            }
        }
    }
}
