package AfterSOLID;

public class DebitCard implements IBankCard {
    public void pay(int amount) {
        System.out.printf("\nPaying %d amount using Debit Card... Done!", amount);
    }
}
