import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Integer : ");
        int a = scan.nextInt();

        System.out.println("Enter Second Integer : ");
        int b = scan.nextInt();

        System.out.println("Enter the Operation you want to perform (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
            case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Try Again");
            }	
            	scan.close();
    }
}
