package Basics.Lesson9;

public class Exercise2 {
    public static void main(String[] args) {
        int startNum = 0;
        int add = 10;

        for (startNum = 10 ; startNum <= 500; startNum+=10) {
        if (startNum%50 == 0){
            System.out.print(startNum + " "+ "\n");
        }
        else{
            System.out.print(startNum + " ");
        }

        }
    }
}
