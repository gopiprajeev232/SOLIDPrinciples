package BeforeSOLID;

/* Single Responsibility Principle states that a class or module should have a single responsibility and only one reason to change. */

public class BankService {
    public int deposit(int amount, String accountNumber)
    {
        return 0;
    }

    public int withdraw(int amount, String accountNumber) {
        return 0;
    }

    public void printPassbook()
    {
        System.out.println("Updating information in passbook... Done!");
    }

    public void sendOTP(String medium) {
        if(medium.equals("Email")) {
            System.out.println("Email is sent.");
        }
    }
}
