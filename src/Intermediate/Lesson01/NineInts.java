package Intermediate.Lesson01;

public class NineInts {
    public static void main(String[] args) {
        int[] nineInts = {1,2,3,4,5,6,7,8,9};

        for (int increase = 0; increase<9; increase++){
            System.out.print(nineInts[increase]+"  ");
        }
        System.out.println("");

        for (int decrease = 8; decrease>=0; decrease--){
            System.out.print(nineInts[decrease]+"  ");
        }
    }
}
