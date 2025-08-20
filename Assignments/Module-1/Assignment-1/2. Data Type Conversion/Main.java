import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temprature in Celsius : ");
		double c = scan.nextDouble();
		double f = (c * 9 / 5) + 32;
		System.out.println("Temprature in Celsius : "+ c +"\nTemprature in Fahrenheit : "+ f);
	}
}
