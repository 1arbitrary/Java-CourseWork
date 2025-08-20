import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Student name : ");

		String student = scan.nextLine();
		System.out.println("Roll number : ");

		int roll = scan.nextInt();
		System.out.println("Marks for the following subjects ");

		System.out.println("English : ");
		int eng = scan.nextInt();
		
		System.out.println("Maths : ");
		int math = scan.nextInt();

		System.out.println("History : ");
		int his = scan.nextInt();

		System.out.println("Name : "+ student +" Roll number : "+ roll +" English : " +eng+ " Maths : "+ math +" History : " + his);
	}

}
