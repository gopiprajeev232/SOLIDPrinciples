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

    public static void main(String... args) {
        IBankCard debitCard = new CreditCard();
        Supermarket s = new Supermarket(debitCard);
        s.buyItems(500);
    }
}
