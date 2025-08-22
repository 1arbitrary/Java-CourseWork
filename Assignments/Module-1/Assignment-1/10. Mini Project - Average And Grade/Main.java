import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Marks for Subject number " + i + " " + (i+1) + " : ");
			arr[i] = scan.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		int average = total/5;

		if(average >= 90) {
			System.out.println("Grade : A");
		} else if(average >= 75) {
			System.out.println("Grade : B");
		} else if(average >= 50) {
			System.out.println("Grade : C");
		} else {
			System.out.println("Result : Failed !");
		}
		scan.close();
	}

}
