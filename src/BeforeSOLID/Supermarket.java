package BeforeSOLID;

public class Supermarket {
    DebitCard debitCard;

    public Supermarket(DebitCard debitCard)
    {
        this.debitCard = debitCard;
    }

    public void buyItems(int amount)
    {
        debitCard.pay(amount);
    }

    public static void main(String[] args)
    {
        DebitCard debitCard = new DebitCard();
        Supermarket supermarket = new Supermarket(debitCard);
        supermarket.buyItems(5000);
    }
}

