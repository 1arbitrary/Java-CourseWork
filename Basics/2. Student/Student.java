import java.util.Scanner;

public class Student {
	// TODO: create an input function for taking input
	// TODO : create a display function to display all the details

	public static String name;

	public static void Input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome, Please Enter your name : ");
		name = scan.nextLine();
		
		System.out.print("Please Enter your Age : ");
		int age = scan.nextInt();

		System.out.print("Please Enter your Gender : ");
		
		scan.close();
	}

	public static void main(String args[]) {
		Input();
	}
}
