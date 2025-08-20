import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[5];

		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the marks for student no"+i+" = ");
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Marks for student "+ i + " is = " + arr[i]);
		}
	}

}
