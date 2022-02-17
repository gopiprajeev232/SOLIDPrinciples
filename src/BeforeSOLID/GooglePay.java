package BeforeSOLID;

public class GooglePay implements UPIPayment {

    @Override
    public void payMoneyThroughUPI(int amount) {
        System.out.printf("%d has been paid", amount);
    }

    @Override
    public void getScratchCard() {
        System.out.println("Congratulations! You've earned a scratch card.");
    }

    @Override
    public void getCashBackAsCredit() {
        System.out.println("Cash back not applicable for Google Pay.");
    }
}
