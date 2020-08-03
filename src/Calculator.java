import java.util.Scanner;
public class Calculator {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = scan.nextInt();
        System.out.print("enter Number 2: ");
        int b = scan.nextInt();
        System.out.print("Enter Operation: ");
        String c = scan.next();
        System.out.print("Answer: ");
        switch (c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;


        }
    }

}
