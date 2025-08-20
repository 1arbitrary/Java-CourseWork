import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");

		int age = scan.nextInt();

		System.out.println("do you have citizenship : ");
		String ans = scan.next();
		
		if( age > 18 && ans == "True" ) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible");
		}
	}
}
