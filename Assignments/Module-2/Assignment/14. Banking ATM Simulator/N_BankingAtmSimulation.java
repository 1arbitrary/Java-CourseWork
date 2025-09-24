import java.util.*;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class N_BankingAtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account("A101", "John Doe");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String operation = input[0];

            switch (operation) {
                case "deposit":
                    double depositAmount = Double.parseDouble(input[1]);
                    account.deposit(depositAmount);
                    break;

                case "withdraw":
                    double withdrawAmount = Double.parseDouble(input[1]);
                    account.withdraw(withdrawAmount);
                    break;

                case "getBalance":
                    account.getBalance();
                    break;

                default:
                    System.out.println("Invalid Operation");
            }
        }

        sc.close();
    }
}
