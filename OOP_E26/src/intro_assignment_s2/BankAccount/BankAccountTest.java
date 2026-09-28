package intro_assignment_s2.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, 0.10, 0.01);
        System.out.println("Current balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.applyInterest();
        System.out.println("Balance after interest: " + account.getBalance());
    }
}
