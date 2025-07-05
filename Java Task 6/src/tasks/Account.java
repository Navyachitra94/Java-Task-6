package tasks;

public class Account {

    private long accountNumber;
    private String accHolderName;
    private double accBalance;

    // No Argument
    public Account() {
        this.accountNumber = 0;
        this.accHolderName = "Noname";
        this.accBalance = 0.0;
    }

    // Two Argument
    public Account(long accountNumber, String accHolderName) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.accBalance = 0.0;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            accBalance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= accBalance) {
                accBalance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Balance
    public void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f\n", accBalance);
    }

    // Display Account Info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.printf("Account Balance: ₹%.2f\n", accBalance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account(1234567890L, "Joseph");

        acc2.deposit(1000);
        acc2.withdraw(500);
        acc2.checkBalance();
        acc2.displayAccountInfo();
    }
}
