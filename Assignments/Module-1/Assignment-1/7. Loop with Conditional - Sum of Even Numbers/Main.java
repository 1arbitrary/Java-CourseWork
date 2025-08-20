public class Main {
    public static void main(String[] args) {
	System.out.println("Sum of even numbers");
	
	int i = 1;
	int a = 0;

	while(i <= 50) {
	    if( i % 2 == 0) {
		a = a + i;
	    }
	    i++;
	}

	System.out.println("sum of even numbers from 1 to 50 is = "+ a);
    }
}
