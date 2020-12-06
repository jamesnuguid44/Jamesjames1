package Lesson10;

public class Exercise1 {
    public static void main(String[] args) {
        int startNum = 10;
        while (startNum<=500){
            System.out.print(startNum+ ", ");
            startNum+=10;
            while (startNum%50==0){
                System.out.print(startNum);
                System.out.print("\n");
                startNum+=10;
            }

        }
    }
}
