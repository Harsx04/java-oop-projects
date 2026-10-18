public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Reject invalid amounts before changing the balance.
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }
    public void withdraw(double amount) {
        // Reject invalid transactions before changing the balance.
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }
}
