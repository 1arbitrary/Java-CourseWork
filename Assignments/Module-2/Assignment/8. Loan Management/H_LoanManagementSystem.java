import java.util.Scanner;

abstract class Loan{
    protected double principal;
    protected double rate;
    protected int time;


    public Loan(double principal, int time){
        this.principal = principal;
        this.time = time;
    }


    public abstract double calculateInterest();

}

class HomeLoan extends Loan{
    public HomeLoan(double principal, int time){
        super(principal,time);
        this.rate = 8;
    }

    @Override public double calculateInterest(){
        return (principal*rate*time)/100;
    }

}

class CarLoan extends Loan{
    public CarLoan(double principal, int time){
        super(principal,time);
        this.rate = 10;
    }

    @Override public double calculateInterest(){
        return (principal*rate*time)/100;
    }

}


public class H_LoanManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of loans you want:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter details of loan in this format(loan type, principal amount, time in years):");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(",");

            String type = parts[0];
            double principal = Double.parseDouble(parts[1]);
            int time = Integer.parseInt(parts[2]);

            Loan loan;

            if (type.equalsIgnoreCase("Home")) {
                loan = new HomeLoan(principal, time);
                System.out.println("Home Loan Interest: " + loan.calculateInterest());
            } else if (type.equalsIgnoreCase("Car")) {
                loan = new CarLoan(principal, time);
                System.out.println("Car Loan Interest: " + loan.calculateInterest());
            } else {
                System.out.println("Invalid Loan Type");
            }
        }

        sc.close();
    }
}