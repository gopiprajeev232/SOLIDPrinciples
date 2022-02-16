package AfterSOLID.SRP;

public class BankService {
    public void deposit(int amount, String accountNumber) {
        System.out.printf("\nDepositing %d to account %s...\n", amount, accountNumber);
    }

    public void withdraw(int amount, String accountNumber) {
        System.out.printf("\nWithdrawing %d from account %s...", amount, accountNumber);
    }
}
