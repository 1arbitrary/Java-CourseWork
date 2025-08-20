import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter integer 1 : ");
		int a = scan.nextInt();

		System.out.println("enter integer 2 : ");
		int b = scan.nextInt();

		System.out.println("enter function you want to perform : ");
		char f = scan.next().charAt(0);

		if( f == '+') {
			System.out.println("a + b = "+(a+b));
		} else if(f == '-'){
			System.out.println("a - b = "+(a-b));
		} else if(f == '*'){
			System.out.println("a * b = "+(a*b));
		} else if(f == '/'){
			System.out.println("a / b = "+(a/b));
		}
	}
}
