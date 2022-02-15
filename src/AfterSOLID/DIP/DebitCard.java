package AfterSOLID.DIP;

public class DebitCard implements IBankCard {
    public void pay(int amount) {
        System.out.printf("Paying %d amount using Debit Card... Done!", amount);
    }
}
