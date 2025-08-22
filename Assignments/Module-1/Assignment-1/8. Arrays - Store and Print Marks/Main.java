import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];

		// Takes input of the marks of the student
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the Total Marks for student "+ i + " : ");
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Total Marks for student "+ i + " : " + arr[i]);
		}
		scan.close();
	}
}
