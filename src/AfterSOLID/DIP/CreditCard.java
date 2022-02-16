package AfterSOLID.DIP;

public class CreditCard implements IBankCard {
    public void pay(int amount) {
        System.out.printf("\nPaying %d amount using Credit Card... Done!", amount);
    }
}
