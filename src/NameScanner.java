import java.util.Scanner;
public class NameScanner {
    public static void main(String[] args){
        Scanner nameScanner = new Scanner(System.in);
        String[] name = {"James Nuguid","Jan Medina","Russell Manalac"};
        System.out.print("Enter First Name: ");
        String names = nameScanner.nextLine();
        switch (names) {
            case "James":
                System.out.println("Your name is "+ name[0]);
                break;
            case "Jan":
                System.out.println("Your name is "+ name[1]);
                break;
            case "Russell":
                System.out.println("Your name is "+ name[2]);
                break;
        }
    }

}
