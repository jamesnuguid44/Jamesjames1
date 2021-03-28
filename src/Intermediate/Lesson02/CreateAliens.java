package Intermediate.Lesson02;

public class CreateAliens {
    public static void main(String[] args) {
        Martian martian1 = new Martian("Zhongli", 2, 4);
        Jupiterian jupiterian1 = new Jupiterian("Guizhong", 4, 6);

        System.out.println(martian1.toString());
        System.out.println(jupiterian1.toString());
    }
}
