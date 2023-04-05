import java.util.Scanner;

class LessBalanceException extends Exception {
    public LessBalanceException(int amount) {
        super("Withdraw amount of Rs " + amount + " is not valid.");
    }
}
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 500.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Rs " + amount + " deposited successfully. Current balance is Rs " + this.balance);
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (this.balance - amount < 500.0) {
            throw new LessBalanceException((int) amount);
        }
        this.balance -= amount;
        System.out.println("Rs " + amount + " withdrawn successfully. Current balance is Rs " + this.balance);
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for account 1:");
        System.out.print("Account number: ");
        String accountNumber1 = sc.next();
        System.out.print("Account holder name: ");
        String accountHolderName1 = sc.next();

        System.out.println("Enter details for account 2:");
        System.out.print("Account number: ");
        String accountNumber2 = sc.next();
        System.out.print("Account holder name: ");
        String accountHolderName2 = sc.next();

        Account account1 = new Account(accountNumber1, accountHolderName1);
        Account account2 = new Account(accountNumber2, accountHolderName2);

        System.out.println("Enter deposit amount for account 1:");
        double depositAmount1 = sc.nextDouble();
        account1.deposit(depositAmount1);

        System.out.println("Enter deposit amount for account 2:");
        double depositAmount2 = sc.nextDouble();
        account2.deposit(depositAmount2);

        System.out.println("Enter withdrawal amount for account 2:");
        double withdrawalAmount2 = sc.nextDouble();
        try {
            account2.withdraw(withdrawalAmount2);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
