package Practice;

import java.util.Scanner;

public class Boolean {

    final static char MAPUTI = 'w';
    final static char MORENO = 'y';
    final static char MAITIM = 'b';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the color of your skin? w = White, y = Yellow, b = Brown : ");
        char color = scanner.nextLine().charAt(0);

        boolean maputi = color == MAPUTI;
        System.out.println("\nMaputi ba? "+ maputi);

        boolean moreno = color == MORENO;
        System.out.println("Moreno ba? "+ moreno);

        System.out.println("Maitim ba? "+(color==MAITIM));



    }
}
