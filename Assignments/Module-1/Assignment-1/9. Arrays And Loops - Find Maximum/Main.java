import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 10 integers:  ");

	int arr[] = new int[10];

	for(int i = 0; i < 10; i++) {
	    System.out.println("Integer " + i + " : ");
	    arr[i] = scan.nextInt();
	}
		
	int max = arr[0];
		
	for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
	
        }
        System.out.println("Max Value: " + max);
		scan.close();
    }
}
