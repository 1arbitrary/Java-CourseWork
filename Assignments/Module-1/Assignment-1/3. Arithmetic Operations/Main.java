import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Integer 1 : ");
		int a = scan.nextInt();

		System.out.println("Enter Integer 2 : ");
		int b = scan.nextInt();

		System.out.println("Addition : "+ (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		System.out.println("Modulus : " + (a%b));
	}
}
