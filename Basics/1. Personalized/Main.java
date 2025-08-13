import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, please enter your Name : ");
		String name = scan.nextLine();

		System.out.println("Hello " + name + ", Welcome to Java");
		scan.close();
	}
}
