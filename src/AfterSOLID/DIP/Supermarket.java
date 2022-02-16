package AfterSOLID.DIP;

public class Supermarket {
    IBankCard card;

    public Supermarket(IBankCard card) {
        this.card = card;
    }

    public void buyItems(int amount)
    {
        card.pay(amount);
    }
}
