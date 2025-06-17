// Account.java (Base Class)
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        System.out.println("Calculating basic interest for account " + accountNumber);
        return 0.0; // Default: no interest or minimal interest for a generic account
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

// SavingsAccount.java (Derived Class)
class SavingsAccount extends Account {
    private double interestRate; // e.g., 0.02 for 2%

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Calculating savings interest for account " + accountNumber);
        return balance * interestRate;
    }
}

// FixedDepositAccount.java (Derived Class)
class FixedDepositAccount extends Account {
    private double annualInterestRate;
    private int tenureInYears;

    public FixedDepositAccount(String accountNumber, double balance, double annualInterestRate, int tenureInYears) {
        super(accountNumber, balance);
        this.annualInterestRate = annualInterestRate;
        this.tenureInYears = tenureInYears;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Calculating fixed deposit interest for account " + accountNumber);
        // Simple interest calculation for demonstration
        return balance * annualInterestRate * tenureInYears;
    }
}

// BankingApp.java (Main Class)
public class BankingApp {
    public static void main(String[] args) {
        Account generalAccount = new Account("ACC001", 1000);
        SavingsAccount savings = new SavingsAccount("SAV001", 5000, 0.03); // 3% interest
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD001", 10000, 0.06, 5); // 6% for 5 years

        System.out.println("--- General Account ---");
        System.out.println("Interest: $" + generalAccount.calculateInterest());

        System.out.println("\n--- Savings Account ---");
        System.out.println("Interest: $" + savings.calculateInterest());

        System.out.println("\n--- Fixed Deposit Account ---");
        System.out.println("Interest: $" + fixedDeposit.calculateInterest());

        // Demonstrating polymorphism
        System.out.println("\n--- Polymorphic Interest Calculation ---");
        Account[] accounts = new Account[3];
        accounts[0] = generalAccount;
        accounts[1] = savings;
        accounts[2] = fixedDeposit;

        for (Account acc : accounts) {
            System.out.println("Account " + acc.accountNumber + " interest: $" + acc.calculateInterest());
        }
    }
}