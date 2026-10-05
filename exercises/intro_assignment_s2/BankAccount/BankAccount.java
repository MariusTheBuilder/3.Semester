package intro_assignment_s2.BankAccount;

public class BankAccount {
    public double balance;
    public double borrowingRate;
    public double savingsRate;

    private static final double MIN_BALANCE = -100_000;
    private static final double MAX_BALANCE = 250_000;
    private static final double MIN_BORROWING_RATE = 0.06;
    private static final double MAX_SAVINGS_RATE = 0.02;

    public BankAccount(double balance, double borrowingRate, double savingRate){
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            throw new IllegalArgumentException("Invalid starting balance");
        }
        if (borrowingRate < MIN_BORROWING_RATE) {
            throw new IllegalArgumentException("Borrowing rate must be at least 6%");
        }
        if (savingsRate > MAX_SAVINGS_RATE) {
            throw new IllegalArgumentException("Savings rate must be at most 2%");
        }

        this.balance = balance;
        this.borrowingRate = borrowingRate;
        this.savingsRate = savingRate;
    }

    public void deposit(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative amount");
        }
        double newBalance = balance + amount;
        if (newBalance > MAX_BALANCE) {
            throw new IllegalStateException("Deposit would exceed maximum balance");
        }
        balance = newBalance;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        double newBalance = balance - amount;
        if (newBalance < MIN_BALANCE) {
            throw new IllegalStateException("Withdrawal would exceed minimum balance");
        }
        balance = newBalance;
    }

    public void applyInterest() {
        if (balance < 0) {
            balance += balance * borrowingRate; // charge interest on debt
        } else {
            balance += balance * savingsRate; // accrue interest on savings
        }

        // clamp just in case interest pushes past limits
        if (balance > MAX_BALANCE) balance = MAX_BALANCE;
        if (balance < MIN_BALANCE) balance = MIN_BALANCE;
    }

    public void setBorrowingRate(double rate) {
        if (rate < MIN_BORROWING_RATE) {
            throw new IllegalArgumentException("Borrowing rate must be at least 6%");
        }
        this.borrowingRate = rate;
    }

    public void setSavingsRate(double rate) {
        if (rate > MAX_SAVINGS_RATE) {
            throw new IllegalArgumentException("Savings rate must be at most 2%");
        }
        this.savingsRate = rate;
    }

    public double getBalance() {
        return balance;
    }
}
