import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = scan.nextInt();
		scan.nextLine();

		System.out.println("Do you have citizenship (Enter True or false): ");
		boolean ans = scan.nextBoolean();
		
		if( age >= 18 && ans) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible");
		}
		scan.close();
	}
}
