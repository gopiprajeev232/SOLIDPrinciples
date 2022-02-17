package AfterSOLID;

public class GooglePay implements UPIPayment {
    public void payMoneyThroughUPI(int amount) {
        System.out.printf("\n%d has been paid.\n", amount);
    }

    @Override
    public void getScratchCard() {
        System.out.println("Congratulations! You've earned a scratch card.");
    }
}
